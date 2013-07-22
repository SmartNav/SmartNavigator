package com.sdu.fwwb.smartnav.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.sdu.fwwb.smartnav.dao.PlaceDAO;
import com.sdu.fwwb.smartnav.entity.Place;

@Service
public class PlaceService {
	
	private static final Logger log = Logger.getLogger(PlaceService.class);
	
	@Autowired
	PlaceDAO placeDao;
	
	public void add(String name, int level, int type, String description,
			double latitude, double longitude){
		Place place = new Place(name,level,type,description,latitude,longitude);
		placeDao.save(place);
		log.debug("add a new place:"+place);
	}
	
	public Page<Place> listAll(int page,int size){
		return placeDao.findAll(new PageRequest(page, size));
	}

}
