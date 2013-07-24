package com.sdu.fwwb.smartnav.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sdu.fwwb.smartnav.entity.Activity;

@Repository
public interface ActivityDAO extends CrudRepository<Activity, Long>{

	public List<Activity> findByPlaceId(long placeId);

	@Modifying
	@Query("delete from Discount where placeId = ?1")
	public void deleteByPlaceId(long placeId);
	
}
