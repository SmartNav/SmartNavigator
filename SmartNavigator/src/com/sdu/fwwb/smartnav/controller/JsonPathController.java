package com.sdu.fwwb.smartnav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.sdu.fwwb.smartnav.entity.Point;
import com.sdu.fwwb.smartnav.service.PointService;

@Controller
@RequestMapping("/json/query")
public class JsonPathController {

	Gson gson = new Gson();
	
	@Autowired
	PointService pointService;
	
	@RequestMapping("/path")
	@ResponseBody
	public String caculatePath(@RequestParam("la1") double la1,@RequestParam("lo1") double lo1,
			@RequestParam("la2") double la2,@RequestParam("lo2") double lo2){
		
		Point p1 = new Point();
		p1.setLatitude(la1);
		p1.setLongitude(lo1);
		Point p2 = new Point();
		p2.setLatitude(la2);
		p2.setLongitude(lo2);
		
		return gson.toJson(pointService.getinitPoint(p1, p2));
	}
	
}
