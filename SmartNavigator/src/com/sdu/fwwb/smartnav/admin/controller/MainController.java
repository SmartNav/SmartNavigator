package com.sdu.fwwb.smartnav.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class MainController {

	@RequestMapping(value="/index")
	public String index(){
		return "admin/index";
	}
}
