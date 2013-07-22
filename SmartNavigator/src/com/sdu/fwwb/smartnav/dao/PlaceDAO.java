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
	
	@Query("from Place a where a.latitude < ?1 and a.latitude > ?2 and a.longitude <?3 and a.longitude > ?4 and a.level <= ?5")
	public List<Place> findByLatitudeAndLongtitudeAndLevelBetween(double latitudeUp,
			double latitudeDown,double longitudeUp,double longitudeDown,int level);
}