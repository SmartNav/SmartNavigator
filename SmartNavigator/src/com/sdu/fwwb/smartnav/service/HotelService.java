package com.sdu.fwwb.smartnav.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdu.fwwb.smartnav.dao.HotelDAO;
import com.sdu.fwwb.smartnav.dao.PlaceDAO;
import com.sdu.fwwb.smartnav.entity.Hotel;
import com.sdu.fwwb.smartnav.entity.Place;

@Service
public class HotelService {

	private static final Logger log = Logger.getLogger(HotelService.class);
	
	@Autowired
	HotelDAO hotelDao;
	
	@Autowired
	PlaceDAO placeDao;
	
	@Transactional
	public void add(String name,int level,int type,String description,double latitude,double longitude,int star,String maxPrice,String minPrice,int leftRooms,String tel,String location){
		Place place = new Place(name, level, type, description, latitude, longitude);
		placeDao.save(place);
		List<Place> places = placeDao.findByLatitudeAndLongitude(latitude, longitude);
		long id = places.get(places.size()-1).getId();
		Hotel hotel = new Hotel(id, name, star, minPrice, maxPrice, leftRooms, 0,null, tel, location, description);
		hotelDao.save(hotel);
		log.debug("add hotel:"+hotel);
	}
	
}
