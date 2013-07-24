package com.sdu.fwwb.smartnav.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.sdu.fwwb.smartnav.entity.User;

@Repository
public interface UserDAO extends CrudRepository<User, Long>{	

	@Query("select 1 from User where userName = ?1")
	public int isUserExists(String userName);
	
	public List<User> findByUserName(String userName);
	
	public User findByEmail(String email);
	public User findByEmailAndPassword(String email,String password);
	
	
}
