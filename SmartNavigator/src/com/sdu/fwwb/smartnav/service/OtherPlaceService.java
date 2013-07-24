package com.sdu.fwwb.smartnav.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdu.fwwb.smartnav.dao.OtherPlaceDAO;
import com.sdu.fwwb.smartnav.dao.PlaceDAO;
import com.sdu.fwwb.smartnav.entity.OtherPlace;
import com.sdu.fwwb.smartnav.entity.Place;

@Service
public class OtherPlaceService {

	private static final Logger log = Logger.getLogger(OtherPlaceService.class);
	
	@Autowired
	OtherPlaceDAO otherPlaceDao;
	
	@Autowired
	PlaceDAO placeDao;
	
	@Transactional
	public void add(String name,int level,int type,String description,double latitude,double longitude,String location,String img){
		Place place = new Place(name, level, type, description, latitude, longitude);
		placeDao.save(place);
		List<Place> places = placeDao.findByLatitudeAndLongitude(latitude, longitude);
		long id = places.get(places.size()-1).getId();
		OtherPlace otherPlace = new OtherPlace(id, name, location, description, level, latitude, longitude, img);
		otherPlaceDao.save(otherPlace);
		log.debug("add otherPlace:"+otherPlace);
	}
	
	@Transactional
	public void modify(long id,String name,int level,int type,String description,double latitude,double longitude,String location,String img,boolean deleteImg){
		Place place = new Place(id,name, level, type, description, latitude, longitude);
		placeDao.save(place);
		placeDao.save(place);
		if(!deleteImg){
			OtherPlace ho = otherPlaceDao.findOne(id);
			img = (img==null)?ho.getImg():img;
		}else img = null;
		OtherPlace otherPlace = new OtherPlace(id, name, location, description, level, latitude, longitude, img);
		otherPlaceDao.save(otherPlace);
		log.debug("modify otherPlace:"+otherPlace);
	}
	
	public Page<OtherPlace> list(int page,int size){
		return otherPlaceDao.findAll(new PageRequest(page, size));
	}
	
	@Transactional
	public void delete(List<Long> ids){
		for(Long id:ids){
			otherPlaceDao.delete(id);
			//delete infos in meta table
			placeDao.delete(id);
		}
	}
	
	public OtherPlace getOtherPlace(long id){
		return otherPlaceDao.findOne(id);
	}
	
}
