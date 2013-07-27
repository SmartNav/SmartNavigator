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
	
		double lat1 = 36.667382, lng1 = 117.148533, lat2 = 36.682014, lng2 = 117.137933;
		Path p = pointService.getinitPoint(lat1, lng1, lat2, lng2);
		System.out.println(p.toString());
	}
}
