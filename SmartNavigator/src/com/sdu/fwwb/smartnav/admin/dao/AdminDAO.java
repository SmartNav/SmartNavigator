package com.sdu.fwwb.smartnav.admin.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sdu.fwwb.smartnav.admin.entity.Admin;

@Repository
public interface AdminDAO extends CrudRepository<Admin, Long>{	

	public Admin findByNameAndPassword(String name,String password);
	
	public Admin findByName(String name);
	
	public Admin findByEmail(String email);
	
	
}
