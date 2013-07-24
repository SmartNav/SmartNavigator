package com.sdu.fwwb.smartnav.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdu.fwwb.smartnav.algorithm.CalDistence;
import com.sdu.fwwb.smartnav.algorithm.floyd;
import com.sdu.fwwb.smartnav.dao.DistDao;
import com.sdu.fwwb.smartnav.dao.PointDao;
import com.sdu.fwwb.smartnav.entity.Dist;
import com.sdu.fwwb.smartnav.entity.Point;
import com.sdu.fwwb.smartnav.json.model.Path;

@Service
public class PointService {

	private static final Logger log = Logger.getLogger(PointService.class);

	@Autowired
	PointDao pointDao;

	Point p1, p2;

	public Path getinitPoint(Point p1, Point p2){
		this.p1 = p1;
		this.p2 = p2;
		log.debug("获取起止点：" + p1.getName() + p2.getName());
		return calPath();
	}
	
	public Point calMin(Point p) {
		double MIN = Double.MAX_VALUE;
		Point result = new Point();
		CalDistence d = new CalDistence();
		
		Iterable<Point> plist = pointDao.findAll();
		Iterator<Point> i = plist.iterator();
		
		while (i.hasNext()) {
			Point tmp = i.next();	
			if (d.cal(tmp, p) < MIN) {
				MIN = d.cal(tmp, p);
				result = tmp;
			}
		}
		return result;
	}

	@Autowired
	DistDao distDao;

	double map[][] = new double[50][50];
	int n = 20;
	Point from, to;
	private static int inf = (1 << 29);
	floyd f = new floyd(); 
	
	public Path calPath() {
		
		Path path = new Path();
		ArrayList<Point> list = new ArrayList<Point>(); 
		
		// 初始化map
		for (int i = 0; i < 50; i++)
			for (int j = 0; j < 50; j++)
				map[i][j] = inf;

		
		Iterable<Dist> dlist = distDao.findAll();
		Iterator<Dist> it = dlist.iterator();
		while(it.hasNext()){
			Dist d = it.next();			
			map[d.getStart()][d.getEnd()] = d.getWeight();
		}
		
		from = calMin(p1);
		to = calMin(p2);
		
		log.debug("计算得到的起止点：" + from.getName() + to.getName());
		
		String result = f.run(n, map, from, to);
		String s[] = new String[30];
		s= result.split("@");
		
		path.setDis(Double.parseDouble(s[0]));
		for(int i=1;i<s.length;i++){
			list.add(pointDao.findByName("v"+s[i]));
		}
		
		path.setPlist(list);
		
		return path;
	}
}
