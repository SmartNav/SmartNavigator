package com.sdu.fwwb.smartnav.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sdu.fwwb.smartnav.service.HotelService;

@Controller
@RequestMapping(value="/admin/hotel")
public class AdminHotelController {
	
	@Autowired
	HotelService hotelService;

	@RequestMapping(value="/add/handle")
	public String addHandle(@RequestParam("name")String name,@RequestParam("level") int level,
			@RequestParam("type") int type,@RequestParam("descript")String description,@RequestParam("lalong")String lalong,
			@RequestParam("hotel-star") int star,@RequestParam("hotel-max-price") String maxPrice,@RequestParam("hotel-min-price") String minPrice,
			@RequestParam("hotel-rest-rooms") int leftRooms,@RequestParam("hotel-phone") String tel,@RequestParam("hotel-local")String location){
		String[] lalongs = lalong.split(",");
		double latitude = Double.parseDouble(lalongs[0]);
		double longitude = Double.parseDouble(lalongs[1]);
		hotelService.add(name, level, type, description, latitude, longitude, star, maxPrice, minPrice, leftRooms, tel, location);
		return "redirect:/admin/place/add";
	}
	
}
