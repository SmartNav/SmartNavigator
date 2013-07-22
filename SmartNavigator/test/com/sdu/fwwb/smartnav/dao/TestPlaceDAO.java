package com.sdu.fwwb.smartnav.dao;

import org.spring.SpringContextTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.junit.*;

@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestPlaceDAO extends SpringContextTestCase{

	@Autowired
	PlaceDAO placeDao;
	
	@Before
	public void before(){
		
	}
	
	@After
	public void after(){
		
	}
	
	@Test
	public void  testIsUserExists(){
	}
	
	@Test
	public void testFindByUserName(){
	}
	@Test
	public void testFindByLatitudeAndLongtitudeAndLevelBetween(){
		System.out.println(placeDao.findByLatitudeAndLongtitudeAndLevelBetween
				(36.6800, 36.67500, 117.140, 117.135, 17));
		System.out.println(placeDao.findByLatitudeAndLongtitudeAndLevelBetween
				(36.6800, 36.67500, 117.140, 117.135, 7));

		System.out.println(placeDao.findByLatitudeAndLongtitudeAndLevelBetween
				(37.00, 37.900, 117.140, 117.135, 13));
		

		System.out.println(placeDao.findByLatitudeAndLongtitudeAndLevelBetween
				(36.6800, 36.67500, 144.140, 144.135, 13));
	}
	
	@Test
	public void testFind(){
		System.out.println(placeDao.findAll(new PageRequest(1, 10)).getContent());
		System.out.println(placeDao.findAll(new PageRequest(0, 10)).getContent());
	}
	
}
