package com.sdu.fwwb.smartnav.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.sdu.fwwb.smartnav.entity.Hotel;
import com.sdu.fwwb.smartnav.entity.Place;
import com.sdu.fwwb.smartnav.entity.Restaurant;
import com.sdu.fwwb.smartnav.entity.Scenic;
import com.sdu.fwwb.smartnav.service.HotelService;
import com.sdu.fwwb.smartnav.service.PlaceService;
import com.sdu.fwwb.smartnav.service.RestaurantService;
import com.sdu.fwwb.smartnav.service.ScenicService;

@Controller
@RequestMapping(value="/json/query")
public class JsonQueryController {
	
	private static final Logger log = Logger.getLogger(JsonQueryController.class);
	
	private Gson gson = new Gson();
	
	@Autowired
	PlaceService placeService;
	
	@Autowired
	HotelService hotelService;
	
	@Autowired
	RestaurantService restaurantService;
	
	@Autowired
	ScenicService scenicService;
	
	@RequestMapping("/place")
	@ResponseBody
	public String placeQuery(@RequestParam("laup")double latitudeUp,@RequestParam("ladown") double latitudeDown,
			@RequestParam("loup") double longitudeUp,@RequestParam("lodown") double longitudeDown,@RequestParam("level") int level){
		List<Place> places = placeService.queryByBoundsAndLevel(latitudeUp, latitudeDown, longitudeUp, longitudeDown, level);
		log.debug("places:"+places);
		String result =  gson.toJson(places);
		log.debug("result:"+result);
		return result;
	}
	
	@RequestMapping("/hotel")
	@ResponseBody
	public String hotelQuery(@RequestParam("id")long id){
		Hotel hotel = hotelService.getHotel(id);
		log.debug("hotel:"+hotel);
		return gson.toJson(hotel);
	}
	
	@RequestMapping("/restaurant")
	@ResponseBody
	public String restaurantQuery(@RequestParam("id")long id){
		Restaurant restaurant = restaurantService.getRestaurant(id);
		log.debug("restaurant:"+restaurant);
		return gson.toJson(restaurant);
	}
	
	@RequestMapping("/scenic")
	@ResponseBody
	public String scenicQuery(@RequestParam("id")long id){
		Scenic scenic = scenicService.getScenic(id);
		log.debug("scenic:"+scenic);
		return gson.toJson(scenic);
	}
}
