package com.sdu.fwwb.smartnav.admin.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sdu.fwwb.smartnav.service.PlaceService;

@Controller
@RequestMapping(value="/admin/place")
public class PlaceController {

	private static final Logger log = Logger.getLogger(PlaceController.class);
	
	@Autowired
	PlaceService placeService;
	
	@RequestMapping(value="/add")
	public String placeAdd(){
		return "admin/place/add";
	}
	
	@RequestMapping(value="/add/handle",method=RequestMethod.POST)
	public String placeAddHandle(@RequestParam("name")String name,@RequestParam("level") int level,
			@RequestParam("type") int type,@RequestParam("descript")String descript,@RequestParam("lalong")String lalong){
		String[] lalongs = lalong.split(",");
		double latitude = Double.parseDouble(lalongs[0]);
		double longitude = Double.parseDouble(lalongs[1]);
		placeService.add(name, level, type, descript, latitude, longitude);
		return "admin/place/add";
	}
}
