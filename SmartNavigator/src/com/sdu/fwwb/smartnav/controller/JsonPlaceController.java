package com.sdu.fwwb.smartnav.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.sdu.fwwb.smartnav.entity.Place;
import com.sdu.fwwb.smartnav.service.PlaceService;

@Controller
@RequestMapping(value="/json/place")
public class JsonPlaceController {
	
	private static final Logger log = Logger.getLogger(JsonPlaceController.class);
	
	@Autowired
	PlaceService placeService;
	
	@RequestMapping("/query")
	@ResponseBody
	public String query(HttpServletResponse response,@RequestParam("laup")double latitudeUp,@RequestParam("ladown") double latitudeDown,
			@RequestParam("loup") double longitudeUp,@RequestParam("lodown") double longitudeDown,@RequestParam("level") int level){
		List<Place> places = placeService.queryByBoundsAndLevel(latitudeUp, latitudeDown, longitudeUp, longitudeDown, level);
		log.debug("places:"+places);
		Gson gson = new Gson();
		String result =  gson.toJson(places);
		log.debug("result:"+result);
		return result;
	}
	
}
