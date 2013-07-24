package com.sdu.fwwb.smartnav.admin.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sdu.fwwb.smartnav.entity.Discount;
import com.sdu.fwwb.smartnav.entity.Place;
import com.sdu.fwwb.smartnav.service.DiscountService;
import com.sdu.fwwb.smartnav.service.PlaceService;

@Controller
@RequestMapping("/admin/discount")
public class AdminDiscountController {

	private static final Logger log = Logger.getLogger(AdminDiscountController.class);
	
	@Autowired
	DiscountService discountService;
	
	@Autowired
	PlaceService placeService;
	
	@RequestMapping("/list")
	public ModelAndView list(@RequestParam("placeid")long placeId){
		ModelAndView mav = new ModelAndView("/admin/discount/list");
		List<Discount> discounts = discountService.listDiscountByPlaceId(placeId);
		mav.addObject("discounts",discounts);
		Place place = placeService.get(placeId);
		mav.addObject("place",place);
		return mav;
	}
	
	@RequestMapping("/modify")
	public ModelAndView modify(@RequestParam("id")long id){
		ModelAndView mav = new ModelAndView("/admin/discount/modify");
		Discount discount = discountService.getDiscount(id);
		mav.addObject("discount",discount);
		return mav;
	}
	
	@RequestMapping("/modify/handle")
	public String modifyHandle(@RequestParam("id") long id,@RequestParam("placeid") long placeId,
			@RequestParam("title")String title,@RequestParam("content") String content,@RequestParam("priority")int priority){
		Discount discount = new Discount(id, placeId, title, content, priority);
		discountService.saveDiscount(discount);
		return "redirect:/admin/discount/list?placeid="+placeId;
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
		discountService.deleteDiscountByIds(ids);
		String placeId= request.getParameter("placeid");
		log.debug("placeId:"+placeId);
		return "redirect:/admin/discount/list?placeid="+placeId;
	}

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("placeid")long placeId){
		ModelAndView mav = new ModelAndView("/admin/discount/add");
		mav.addObject("placeid",placeId);
		return mav;
	}
	
	@RequestMapping("/add/handle")
	public String addHandle(@RequestParam("placeid") long placeId,
	@RequestParam("title")String title,@RequestParam("content") String content,@RequestParam("priority")int priority){
		Discount discount = new Discount(placeId, title, content, priority);
		discountService.saveDiscount(discount);
		return "redirect:/admin/discount/list?placeid="+placeId;
	}
}
