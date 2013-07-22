package com.sdu.fwwb.smartnav.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sdu.fwwb.smartnav.entity.Place;

@Repository
public interface PlaceDAO extends CrudRepository<Place, Long>{
	
}