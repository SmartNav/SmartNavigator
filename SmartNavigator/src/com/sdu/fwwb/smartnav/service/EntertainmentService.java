package com.sdu.fwwb.smartnav.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdu.fwwb.smartnav.dao.EntertainmentDAO;
import com.sdu.fwwb.smartnav.dao.PlaceDAO;
import com.sdu.fwwb.smartnav.entity.Entertainment;
import com.sdu.fwwb.smartnav.entity.Place;

@Service
public class EntertainmentService {

	private static final Logger log = Logger.getLogger(EntertainmentService.class);
	
	@Autowired
	EntertainmentDAO entertainmentDao;
	
	@Autowired
	PlaceDAO placeDao;
	
	@Transactional
	public void add(String name,int level,int type,String description,double latitude,double longitude,String tel,String location,String img){
		Place place = new Place(name, level, type, description, latitude, longitude);
		placeDao.save(place);
		List<Place> places = placeDao.findByLatitudeAndLongitude(latitude, longitude);
		long id = places.get(places.size()-1).getId();
		Entertainment entertainment = new Entertainment(id, name, tel, location, 0, null, description, level, latitude, longitude, img);
		entertainmentDao.save(entertainment);
		log.debug("add entertainment:"+entertainment);
	}
	
	@Transactional
	public void modify(long id,String name,int level,int type,String description,double latitude,double longitude,String tel,String location,String img){
		Place place = new Place(id,name, level, type, description, latitude, longitude);
		placeDao.save(place);
		placeDao.save(place);
		Entertainment en = entertainmentDao.findOne(id);
		Entertainment entertainment = new Entertainment(id, name, tel, location, 0, null, description, level, latitude, longitude, img == null?en.getImg():img);
		entertainmentDao.save(entertainment);
		log.debug("modify entertainment:"+entertainment);
	}
	
	public Page<Entertainment> list(int page,int size){
		return entertainmentDao.findAll(new PageRequest(page, size));
	}
	
	@Transactional
	public void delete(List<Long> ids){
		for(Long id:ids){
			entertainmentDao.delete(id);
			//delete infos in meta table
			placeDao.delete(id);
		}
	}
	
	public Entertainment getEntertainment(long id){
		return entertainmentDao.findOne(id);
	}
}
