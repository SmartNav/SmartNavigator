package com.sdu.fwwb.smartnav.admin.service;

import org.spring.SpringContextTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.junit.*;

@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestAdminAccountService extends SpringContextTestCase{

	@Autowired
	AdminAccountService adminAccountService;
	
	@Before
	public void before(){
		
	}
	
	@After
	public void after(){
		
	}
	
	@Test
	public void  testLogin(){
		System.out.println(adminAccountService.login("test", "admin"));
		System.out.println(adminAccountService.login("admin", "admin"));
	}
	
	@Test
	public void testFindByName(){
		System.out.println(adminAccountService.findByName("test"));
		System.out.println(adminAccountService.findByName("admin"));
	}
	@Test
	public void testFindByEmail(){
		System.out.println(adminAccountService.findByEmail("test@test.com"));
		System.out.println(adminAccountService.findByEmail("admin@smartnav.com"));
	}
	
}
