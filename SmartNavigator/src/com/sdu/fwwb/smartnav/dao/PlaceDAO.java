package com.sdu.fwwb.smartnav.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sdu.fwwb.smartnav.entity.Place;

@Repository
public interface PlaceDAO extends CrudRepository<Place, Long>{
	public List<Place> findByLatitudeAndLongitude(double latitude,double longitude);
	
	public List<Place> findByLatitudeAndLongitudeAndLevel(double latitude,double longitude,int level);
	
	public Page<Place> findAll(Pageable pageable);
}