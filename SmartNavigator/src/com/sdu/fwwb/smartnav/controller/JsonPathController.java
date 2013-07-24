package com.sdu.fwwb.smartnav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.sdu.fwwb.smartnav.dao.PointDao;
import com.sdu.fwwb.smartnav.entity.Point;
import com.sdu.fwwb.smartnav.service.PointService;

@Controller
@RequestMapping("/json/query")
public class JsonPathController {

	Gson gson = new Gson();
	
	@Autowired
	PointService pointService;
	
	@Autowired
	PointDao pointDao;
	
	@RequestMapping("/path")
	@ResponseBody
	public String caculatePath(@RequestParam("la1") double la1,@RequestParam("lo1") double lo1,
			@RequestParam("la2") double la2,@RequestParam("lo2") double lo2){
		
		Point p1 = pointDao.findByLatitudeAndLongitude(la1, lo1);
		Point p2 = pointDao.findByLatitudeAndLongitude(la2, lo2);

		return gson.toJson(pointService.getinitPoint(p1, p2));
	}
	
}
