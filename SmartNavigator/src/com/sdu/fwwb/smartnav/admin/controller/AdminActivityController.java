package com.sdu.fwwb.smartnav.admin.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sdu.fwwb.smartnav.entity.Activity;
import com.sdu.fwwb.smartnav.service.ActivityService;


@Controller
@RequestMapping("/admin/activity")
public class AdminActivityController {

	private static final Logger log = Logger.getLogger(AdminActivityController.class);
	
	@Autowired
	ActivityService activityService;
	
	@RequestMapping("/list")
	public ModelAndView list(@RequestParam("placeid")long placeId){
		ModelAndView mav = new ModelAndView("/admin/activity/list");
		List<Activity> activities = activityService.listActivityByPlaceId(placeId);
		mav.addObject("activities",activities);
		mav.addObject("placeid",placeId);
		return mav;
	}
	
	@RequestMapping("/modify")
	public ModelAndView modify(@RequestParam("id")long id){
		ModelAndView mav = new ModelAndView("/admin/activity/modify");
		Activity activity = activityService.getActivity(id);
		mav.addObject("activity",activity);
		return mav;
	}
	
	@RequestMapping("/modify/handle")
	public String modifyHandle(@RequestParam("id") long id,@RequestParam("placeid") long placeId,
			@RequestParam("title")String title,@RequestParam("content") String content,
			@RequestParam("short-des")String shortDes,@RequestParam("start-time")long startTime,@RequestParam("end-time") long endTime){
		Activity activity = new Activity(id,placeId, title, shortDes, content, new Date(startTime), new Date(endTime));
		activityService.saveActivity(activity);
		return "redirect:/admin/activity/list?placeid="+placeId;
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
		activityService.deleteActivityByIds(ids);
		String placeId= request.getParameter("placeid");
		log.debug("placeId:"+placeId);
		return "redirect:/admin/activity/list?placeid="+placeId;
	}

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("placeid")long placeId){
		ModelAndView mav = new ModelAndView("/admin/activity/add");
		mav.addObject("placeid",placeId);
		return mav;
	}
	
	@RequestMapping("/add/handle")
	public String addHandle(@RequestParam("placeid") long placeId,
	@RequestParam("title")String title,@RequestParam("content") String content,
	@RequestParam("short-des")String shortDes,@RequestParam("start-time")long startTime,@RequestParam("end-time") long endTime){
		Activity activity = new Activity(placeId, title, shortDes, content, new Date(startTime), new Date(endTime));
		activityService.saveActivity(activity);
		return "redirect:/admin/activity/list?placeid="+placeId;
	}
}
