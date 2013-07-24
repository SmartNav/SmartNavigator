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
		Point p1 = pointDao.findByLatitudeAndLongitude(36.665689, 117.117739);
		Point p2 = pointDao.findByLatitudeAndLongitude(36.665269, 117.141455);
		
		Path p = pointService.getinitPoint(p1, p2);
		System.out.println(p);
	}
}
