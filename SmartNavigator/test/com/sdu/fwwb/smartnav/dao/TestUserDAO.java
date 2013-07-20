package com.sdu.fwwb.smartnav.dao;

import org.spring.SpringContextTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.junit.*;

@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestUserDAO extends SpringContextTestCase{

	@Autowired
	UserDAO userDao;
	
	@Before
	public void before(){
		
	}
	
	@After
	public void after(){
		
	}
	
	@Test
	public void  testIsUserExists(){
		System.out.println(userDao.isUserExists("test"));
		System.out.println(userDao.isUserExists("tt"));
	}
	
	@Test
	public void testFindByUserName(){
		System.out.println(userDao.findByUserName("test"));
	}
	@Test
	public void testFindByEmail(){
		System.out.println(userDao.findByEmail("test@test.com"));
	}
	
}
