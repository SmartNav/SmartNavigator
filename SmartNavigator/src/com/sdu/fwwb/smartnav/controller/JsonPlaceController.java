package com.sdu.fwwb.smartnav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/json/place")
public class JsonPlaceController {
	
	@RequestMapping("/query")
	public String query(){
		return "";
	}
	
}
