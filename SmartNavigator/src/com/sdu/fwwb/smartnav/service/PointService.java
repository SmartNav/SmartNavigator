package com.sdu.fwwb.smartnav.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdu.fwwb.smartnav.algorithm.CalDistence;
import com.sdu.fwwb.smartnav.algorithm.floyd;
import com.sdu.fwwb.smartnav.dao.DistDao;
import com.sdu.fwwb.smartnav.dao.PlaceDAO;
import com.sdu.fwwb.smartnav.dao.PointDao;
import com.sdu.fwwb.smartnav.entity.Dist;
import com.sdu.fwwb.smartnav.entity.Place;
import com.sdu.fwwb.smartnav.entity.Point;
import com.sdu.fwwb.smartnav.json.model.Path;

@Service
public class PointService {

	private static final Logger log = Logger.getLogger(PointService.class);

	@Autowired
	PointDao pointDao;

	
	
	private final double eps = 1E-8;

	int sig(double d) {
		return Math.abs(d) < 1E-8 ? 0 : d < 0 ? -1 : 1;
	}

	public Path getinitPoint(double lat1, double lng1, double lat2, double lng2){
		log.debug("获取起止点：" + lat1 +"--" + lng1 + "--" + lat2 +"--" + lng2);
		return calPath(lat1, lng1, lat2, lng2);
	}
	
	public Point calMin(double lat, double lng) {
		double MIN = Double.MAX_VALUE;
		Point result = new Point();
		CalDistence d = new CalDistence();
		
		Iterable<Point> plist = pointDao.findAll();
		Iterator<Point> i = plist.iterator();
		
		while (i.hasNext()) {
			Point tmp = i.next();	

			if (sig(d.cal(tmp.getLatitude(), tmp.getLongitude(), lat, lng) - MIN) < 0) {
				MIN = d.cal(tmp.getLatitude(), tmp.getLongitude(), lat, lng);
				result = tmp;
			}
		}
		return result;
	}

	@Autowired
	DistDao distDao;
	
	@Autowired
	PlaceDAO placeDao;

	double map[][] = new double[50][50];
	int n = 20;
	Point from, to;
	private static int inf = (1 << 29);
	floyd f = new floyd(); 
	
	public Path calPath(double lat1, double lng1, double lat2, double lng2) {
		
		Path path = new Path();
		ArrayList<Point> list = new ArrayList<Point>();
		ArrayList<Place> list1 = new ArrayList<Place>();
		
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
		
		from = calMin(lat1, lng1);
		to = calMin(lat2, lng2);
		
		log.debug("计算得到的起止点：" + from.getName() + to.getName());
		
		String result = f.run(n, map, from, to);
		String s[] = new String[30];
		s= result.split("@");
		
		//设置距离
		path.setDis(Double.parseDouble(s[0]));
		
		//设置路径上的点
		for(int i=1;i<s.length;i++){
			list.add(pointDao.findByName("v"+s[i]));
			Iterable<Place> ii = placeDao.findAll();
			Iterator<Place> iP = ii.iterator();
			while(iP.hasNext()){
				Place place = iP.next();
				if(sig(new CalDistence().cal(place.getLatitude(),place.getLongitude(), pointDao.findByName("v"+s[i]).getLatitude(),pointDao.findByName("v"+s[i]).getLongitude()) - 0.3) < 0)
					if(list1.contains(place)) continue;
					else
						list1.add(place);
			}
		}
		path.setList(list1);
		path.setPlist(list);
		
		//设置路径周围的兴趣点
		
		return path;
	}
}
