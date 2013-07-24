package com.sdu.fwwb.smartnav.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.spring.SpringContextTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

import com.sdu.fwwb.smartnav.dao.PointDao;
import com.sdu.fwwb.smartnav.entity.Point;
import com.sdu.fwwb.smartnav.json.model.Path;

@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestPointService extends SpringContextTestCase{
	
	@Autowired
	PointService pointService;
	
	@Before
	public void before(){
		
	}
	
	@After
	public void after(){
		
	}
	
	@Autowired
	PointDao pointDao;
	
	@Test
	public void testFloyd(){
		Point p1 = new Point();
		Point p2 = new Point();
		p1.setLatitude(36.665689);
		p1.setLongitude(117.117739);
		p2.setLatitude(36.665269);
		p2.setLongitude(117.141455);
		
		Path p = pointService.getinitPoint(p1, p2);
		System.out.println(p.getDis());
		for(int i=0;i<p.getPlist().size();i++){
			System.out.println(p.getPlist().get(i).getName());
		}
	}
}
