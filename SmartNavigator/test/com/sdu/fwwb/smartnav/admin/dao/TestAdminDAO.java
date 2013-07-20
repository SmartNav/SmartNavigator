package com.sdu.fwwb.smartnav.admin.dao;

import org.spring.SpringContextTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.junit.*;

@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestAdminDAO extends SpringContextTestCase{

	@Autowired
	AdminDAO adminDao;
	
	@Before
	public void before(){
		
	}
	
	@After
	public void after(){
		
	}
	
	@Test
	public void  testFindByNameAndPassword(){
		System.out.println(adminDao.findByNameAndPassword("test", "admin"));
		System.out.println(adminDao.findByNameAndPassword("admin", "admin"));
	}
	
	@Test
	public void testFindByName(){
		System.out.println(adminDao.findByName("test"));
		System.out.println(adminDao.findByName("admin"));
	}
	@Test
	public void testFindByEmail(){
		System.out.println(adminDao.findByEmail("test@test.com"));
		System.out.println(adminDao.findByEmail("admin@smartnav.com"));
	}
	
}
