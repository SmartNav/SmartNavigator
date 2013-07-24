package com.sdu.fwwb.smartnav.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.sdu.fwwb.smartnav.entity.Comment;
import com.sdu.fwwb.smartnav.entity.Hotel;
import com.sdu.fwwb.smartnav.entity.Place;
import com.sdu.fwwb.smartnav.entity.Restaurant;
import com.sdu.fwwb.smartnav.entity.Scenic;
import com.sdu.fwwb.smartnav.entity.User;
import com.sdu.fwwb.smartnav.json.model.CommentAndUser;
import com.sdu.fwwb.smartnav.service.AccountService;
import com.sdu.fwwb.smartnav.service.CommentService;
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
	
	@Autowired
	CommentService commentService;
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	ServletContext sc;
	
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
		String img = hotel.getImg();
		if(img != null)hotel.setImg(sc.getContextPath()+img);
		log.debug("hotel:"+hotel);
		return gson.toJson(hotel);
	}
	
	@RequestMapping("/restaurant")
	@ResponseBody
	public String restaurantQuery(@RequestParam("id")long id){
		Restaurant restaurant = restaurantService.getRestaurant(id);
		String img = restaurant.getImg();
		if(img != null) restaurant.setImg(sc.getContextPath()+restaurant.getImg());
		log.debug("restaurant:"+restaurant);
		return gson.toJson(restaurant);
	}
	
	@RequestMapping("/scenic")
	@ResponseBody
	public String scenicQuery(@RequestParam("id")long id){
		Scenic scenic = scenicService.getScenic(id);
		String img = scenic.getImg();
		if(img != null) scenic.setImg(sc.getContextPath()+scenic.getImg());
		log.debug("scenic:"+scenic);
		return gson.toJson(scenic);
	}
	
	public String discountQuery(@RequestParam("latitude")double latitude,@RequestParam("longitude") double longitude){
		return null;
	}
	
	@RequestMapping("/comments")
	@ResponseBody
	public String commentQuery(@RequestParam("placeid")long placeId){
		List<Comment> comments = commentService.listByPlaceId(placeId);
		List<CommentAndUser> commentsAndUsers = new ArrayList<CommentAndUser>();
		for(Comment com:comments){
			User user = accountService.get(com.getUserId());
			//clear password
			user.setPassword(null);
			CommentAndUser cau = new CommentAndUser(com, user);
			commentsAndUsers.add(cau);
		}
		return gson.toJson(commentsAndUsers);
	}
}
