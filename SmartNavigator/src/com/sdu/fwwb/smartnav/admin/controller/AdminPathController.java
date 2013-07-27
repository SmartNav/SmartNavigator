package com.sdu.fwwb.smartnav.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sdu.fwwb.smartnav.service.PointService;

@Controller
@RequestMapping("/admin/path")
public class AdminPathController {

	@Autowired
	PointService pointService;
	@RequestMapping("/add")
	public String add(){
		return "/admin/path/add";
	}
	@RequestMapping("/add/handle")
	public String addHandler(@RequestParam("lalong")String lalong){
		try{
			String lalongs[] = lalong.split(",");
			double latitude = Double.parseDouble(lalongs[0]);
			double longitude = Double.parseDouble(lalongs[1]);
			pointService.add(latitude, longitude);
		}catch(Exception e){
			e.printStackTrace();
			return "redirect:/admin/path/add?failed=true";
		}
		return "redirect:/admin/path/add?success=true";
	}
	
}
