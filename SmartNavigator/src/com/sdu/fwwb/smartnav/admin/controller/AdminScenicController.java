package com.sdu.fwwb.smartnav.admin.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sdu.fwwb.smartnav.entity.Scenic;
import com.sdu.fwwb.smartnav.service.PlaceService;
import com.sdu.fwwb.smartnav.service.ScenicService;

@Controller
@RequestMapping(value="/admin/scenic")
public class AdminScenicController {
	
	private static final Logger log = Logger.getLogger(AdminScenicController.class);
	
	@Autowired
	ScenicService scenicService;
	
	@Autowired
	PlaceService placeService;

	@RequestMapping(value="/add/handle")
	public String addHandle(@RequestParam("name")String name,@RequestParam("level") int level,
			@RequestParam("type") int type,@RequestParam("descript")String description,@RequestParam("lalong")String lalong,
			@RequestParam("scenic-star") int star,@RequestParam("scenic-local")String location){
		String[] lalongs = lalong.split(",");
		double latitude = Double.parseDouble(lalongs[0]);
		double longitude = Double.parseDouble(lalongs[1]);
		scenicService.add(name, level, type, description, latitude, longitude, star, location);
		return "redirect:/admin/place/add";
	}
	
	@RequestMapping(value="/list")
	public ModelAndView list(HttpServletRequest request){
		int size = 30,num;
		ModelAndView mav = new ModelAndView("admin/scenic/list");
		try{
			num = Integer.parseInt(request.getParameter("num"));
		}catch (Exception e) {
			num = 0;
		}
		Page<Scenic> page = scenicService.list(num, size);
		List<Scenic> list = page.getContent();
		
		mav.addObject("list", list);
		mav.addObject("totalPages",page.getTotalPages());
		return mav;
	}
	
	@RequestMapping(value="/delete/handle")
	public String deleteHandle(HttpServletRequest request){
		Enumeration params = request.getParameterNames();
		List<Long> ids = new ArrayList<Long>();
		while( params.hasMoreElements()){
			String param = (String) params.nextElement();
			long id = -1;
			try{
				log.debug("key:"+param+",value:"+request.getParameter(param));
				id = Long.parseLong(param);
			}catch(Exception e){
				e.printStackTrace();
			}
			if( id != -1 && request.getParameter(param).equalsIgnoreCase("on")){
				ids.add(id);
			}
			
		}
		scenicService.delete(ids);
		return "redirect:/admin/scenic/list";
	}
	
	@RequestMapping(value="/modify")
	public ModelAndView modify(@RequestParam("id") long id){
		ModelAndView mav = new ModelAndView("admin/scenic/modify");
		Scenic scenic = scenicService.getScenic(id);
		mav.addObject("scenic",scenic);
		return mav;
	}
	
	@RequestMapping(value="/modify/handle")
	public String modifyHandle(@RequestParam("id") long id,@RequestParam("name")String name,@RequestParam("level") int level,
			@RequestParam("type") int type,@RequestParam("descript")String description,@RequestParam("lalong")String lalong,
			@RequestParam("scenic-star") int star,@RequestParam("scenic-local")String location){
		String[] lalongs = lalong.split(",");
		double latitude = Double.parseDouble(lalongs[0]);
		double longitude = Double.parseDouble(lalongs[1]);
		scenicService.modify(id, name, level, type, description, latitude, longitude, star, location);
		return "redirect:/admin/scenic/list";
	}
	
}
