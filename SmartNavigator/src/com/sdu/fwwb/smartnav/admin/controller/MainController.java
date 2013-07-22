package com.sdu.fwwb.smartnav.admin.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sdu.fwwb.smartnav.entity.Place;
import com.sdu.fwwb.smartnav.service.PlaceService;

@Controller
@RequestMapping(value="/admin")
public class MainController {
	
	private static final Logger log = Logger.getLogger(MainController.class);

	@RequestMapping(value="/index")
	public String index(){
		return "admin/index";
	}
	
}
