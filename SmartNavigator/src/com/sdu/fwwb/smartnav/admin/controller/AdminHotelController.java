package com.sdu.fwwb.smartnav.admin.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.orm.hibernate3.TypeDefinitionBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sdu.fwwb.smartnav.entity.Hotel;
import com.sdu.fwwb.smartnav.entity.Place;
import com.sdu.fwwb.smartnav.service.HotelService;
import com.sdu.fwwb.smartnav.service.PlaceService;
import com.sdu.fwwb.smartnav.util.FileUtils;
import com.sdu.fwwb.smartnav.util.TypeDefinitions;

@Controller
@RequestMapping(value="/admin/hotel")
public class AdminHotelController {
	
	private static final Logger log = Logger.getLogger(AdminHotelController.class);
	
	@Autowired
	HotelService hotelService;
	
	@Autowired
	PlaceService placeService;
	
	@Autowired
	ServletContext sc;

	@RequestMapping(value="/add/handle")
	public String addHandle(@RequestParam("name")String name,@RequestParam("level") int level,
			@RequestParam("type") int type,@RequestParam("descript")String descript, @RequestParam("description")String description,@RequestParam("lalong")String lalong,
			@RequestParam("hotel-star") int star,@RequestParam("hotel-max-price") String maxPrice,@RequestParam("hotel-min-price") String minPrice,
			@RequestParam("hotel-rest-rooms") int leftRooms,@RequestParam("hotel-phone") String tel,@RequestParam("local")String location,@RequestParam("img")MultipartFile mFile){
		String[] lalongs = lalong.split(",");
		double latitude = Double.parseDouble(lalongs[0]);
		double longitude = Double.parseDouble(lalongs[1]);

		String imgPath = null;
		try {
			if(mFile.isEmpty()) imgPath = null;
			else imgPath = FileUtils.copyFileToPlace(sc, mFile.getInputStream(),mFile.getOriginalFilename());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		hotelService.add(name, level, type,descript, description, latitude, longitude, star, maxPrice, minPrice, leftRooms, tel, location,imgPath);
		return "redirect:/admin/place/add?success=true";
	}
	
	@RequestMapping(value="/list")
	public ModelAndView list(HttpServletRequest request){
		int size = 30,num;
		ModelAndView mav = new ModelAndView("admin/hotel/list");
		try{
			num = Integer.parseInt(request.getParameter("num"));
		}catch (Exception e) {
			num = 1;
		}
		num--;
		Page<Hotel> page = hotelService.list(num, size);
		List<Hotel> list = page.getContent();
		
		mav.addObject("list", list);
		mav.addObject("page",page);
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
		hotelService.delete(ids);
		return "redirect:/admin/hotel/list?success=true";
	}
	
	@RequestMapping(value="/modify")
	public ModelAndView modify(@RequestParam("id") long id){
		ModelAndView mav = new ModelAndView("admin/hotel/modify");
		Hotel hotel = hotelService.getHotel(id);
		Place place = placeService.get(id);
		mav.addObject("place",place);
		mav.addObject("hotel",hotel);
		return mav;
	}
	
	@RequestMapping(value="/modify/handle")
	public String modifyHandle(@RequestParam("id")long id,@RequestParam("name")String name,@RequestParam("level") int level,
			@RequestParam("type") int type,@RequestParam("descript")String descript, @RequestParam("description")String description,@RequestParam("lalong")String lalong,
			@RequestParam("hotel-star") int star,@RequestParam("hotel-max-price") String maxPrice,@RequestParam("hotel-min-price") String minPrice,
			@RequestParam("hotel-rest-rooms") int leftRooms,@RequestParam("hotel-phone") String tel,@RequestParam("local")String location,
			@RequestParam("img") MultipartFile mFile,HttpServletRequest request){
		String[] lalongs = lalong.split(",");
		double latitude = Double.parseDouble(lalongs[0]);
		double longitude = Double.parseDouble(lalongs[1]);
		String imgPath = null;
		try {
			if(mFile.isEmpty()) imgPath = null;
			else imgPath = FileUtils.copyFileToPlace(sc, mFile.getInputStream(),mFile.getOriginalFilename());
		} catch (IOException e) {
			e.printStackTrace();
		}
		hotelService.modify(id,name, level, type,descript, description, latitude, longitude, star, maxPrice, minPrice, leftRooms, tel, location,imgPath,request.getParameter("deleteimg") !=null);
		return "redirect:/admin/hotel/list?success=true";
	}
	
}
