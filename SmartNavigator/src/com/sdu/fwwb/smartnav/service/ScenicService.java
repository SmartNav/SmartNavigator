package com.sdu.fwwb.smartnav.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdu.fwwb.smartnav.dao.PlaceDAO;
import com.sdu.fwwb.smartnav.dao.ScenicDAO;
import com.sdu.fwwb.smartnav.entity.Place;
import com.sdu.fwwb.smartnav.entity.Scenic;

@Service
public class ScenicService {

	private static final Logger log = Logger.getLogger(ScenicService.class);
	
	@Autowired
	ScenicDAO scenicDao;
	
	@Autowired
	PlaceDAO placeDao;
	
	@Transactional
	public void add(String name,int level,int type,String descript,String description,double latitude,double longitude,int star,String location,String img){
		Place place = new Place(name, level, type, descript, latitude, longitude);
		placeDao.save(place);
		List<Place> places = placeDao.findByLatitudeAndLongitude(latitude, longitude);
		long id = places.get(places.size()-1).getId();
		Scenic scenic = new Scenic(id, name, star, location, 0, description, level, latitude, longitude,img);
		scenicDao.save(scenic);
		log.debug("add scenic:"+scenic);
	}
	
	@Transactional
	public void modify(long id,String name,int level,int type,String descript,String description,double latitude,double longitude,int star,String location,String img,boolean deleteImg){
		Place place = new Place(id,name, level, type, descript, latitude, longitude);
		placeDao.save(place);
		placeDao.save(place);
		if(!deleteImg){
			Scenic sc = scenicDao.findOne(id);	
			img = (img==null)?sc.getImg():img;
		}else img = null;
		Scenic scenic = new Scenic(id, name, star, location, 0, description, level, latitude, longitude,img);
		scenicDao.save(scenic);
		log.debug("modify scenic:"+scenic);
	}
	
	public Page<Scenic> list(int page,int size){
		return scenicDao.findAll(new PageRequest(page, size));
	}
	
	@Transactional
	public void delete(List<Long> ids){
		for(Long id:ids){
			scenicDao.delete(id);
			//delete infos in meta table
			placeDao.delete(id);
		}
	}
	
	public Scenic getScenic(long id){
		return scenicDao.findOne(id);
	}
}
