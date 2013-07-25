package com.sdu.fwwb.smartnav.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdu.fwwb.smartnav.dao.PlaceDAO;
import com.sdu.fwwb.smartnav.dao.RestaurantDAO;
import com.sdu.fwwb.smartnav.entity.Place;
import com.sdu.fwwb.smartnav.entity.Restaurant;

@Service
public class RestaurantService {

	private static final Logger log = Logger.getLogger(RestaurantService.class);
	
	@Autowired
	RestaurantDAO restaurantDao;
	
	@Autowired
	PlaceDAO placeDao;
	
	@Transactional
	public void add(String name,int level,int type,String flavor,String descript,String description,double latitude,double longitude,String avgPrice,String tel,String location,String img){
		Place place = new Place(name, level, type, descript, latitude, longitude);
		placeDao.save(place);
		List<Place> places = placeDao.findByLatitudeAndLongitude(latitude, longitude);
		long id = places.get(places.size()-1).getId();
		Restaurant restaurant = new Restaurant(id, name, avgPrice, flavor, 0, null, tel, location, description, level, latitude, longitude,img);
		restaurantDao.save(restaurant);
		log.debug("add restaurant:"+restaurant);
	}
	
	@Transactional
	public void modify(long id,String name,int level,int type,String flavor,String descript,String description,double latitude,double longitude,String avgPrice,String tel,String location,String img,boolean deleteImg){
		Place place = new Place(id,name, level, type, descript, latitude, longitude);
		placeDao.save(place);
		placeDao.save(place);
		if(!deleteImg){
			Restaurant re = restaurantDao.findOne(id);
			img = (img == null)?re.getImg():img;
		}else img = null;
		Restaurant restaurant = new Restaurant(id, name, avgPrice, flavor, 0, null, tel, location, description, level, latitude, longitude,img);
		restaurantDao.save(restaurant);
		log.debug("modify restaurant:"+restaurant);
	}
	
	public Page<Restaurant> list(int page,int size){
		return restaurantDao.findAll(new PageRequest(page, size));
	}
	
	@Transactional
	public void delete(List<Long> ids){
		for(Long id:ids){
			restaurantDao.delete(id);
			//delete infos in meta table
			placeDao.delete(id);
		}
	}
	
	public Restaurant getRestaurant(long id){
		return restaurantDao.findOne(id);
	}
}
