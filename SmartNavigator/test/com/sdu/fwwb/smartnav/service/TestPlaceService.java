package com.sdu.fwwb.smartnav.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.spring.SpringContextTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

import com.sdu.fwwb.smartnav.entity.Place;

@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestPlaceService extends SpringContextTestCase{
	
	@Autowired
	PlaceService placeService;
	
	@Before
	public void before(){
		
	}
	
	@After
	public void after(){
		
	}
	
	@Test
	public void testListAll(){
		Page<Place> page = placeService.listAll(0, 5);
		System.out.println(page.getContent());
		System.out.println(page.getTotalPages());
	}
}
