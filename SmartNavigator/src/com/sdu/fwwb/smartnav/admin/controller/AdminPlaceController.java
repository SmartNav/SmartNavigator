package com.sdu.fwwb.smartnav.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sdu.fwwb.smartnav.entity.Place;
import com.sdu.fwwb.smartnav.service.PlaceService;
import com.sdu.fwwb.smartnav.util.FileUtils;

@Controller
@RequestMapping(value="/admin/place")
public class AdminPlaceController {

	private static final Logger log = Logger.getLogger(AdminPlaceController.class);
	
	@Autowired
	PlaceService placeService;
	
	@Autowired
	ServletContext sc;
	
	@RequestMapping(value="/add")
	public String placeAdd(){
		return "admin/place/add";
	}
	
	@RequestMapping(value="/list")
	public ModelAndView placeList(HttpServletRequest request){
		int size = 30,num;
		ModelAndView mav = new ModelAndView("admin/place/list");
		try{
			num = Integer.parseInt(request.getParameter("num"));
		}catch (Exception e) {
			num = 0;
		}
		Page<Place> page = placeService.listAll(num, size);
		List<Place> list = page.getContent();
		mav.addObject("list", list);
		mav.addObject("totalPages",page.getTotalPages());
		return mav;
	}

	@RequestMapping(value="/modify")
	public ModelAndView placeModify(HttpServletRequest request){
		ModelAndView mav = new ModelAndView("admin/place/modify");
		return mav;
	}
	
	@RequestMapping(value="/add/handle",method=RequestMethod.POST)
	public String placeAddHandle(@RequestParam("name")String name,@RequestParam("level") int level,
			@RequestParam("type") int type,@RequestParam("descript")String descript,@RequestParam("lalong")String lalong,@RequestParam("img") MultipartFile mFile){
		if(!FileUtils.isImg(mFile.getOriginalFilename())){
			log.error("not an image file!"+mFile.getOriginalFilename());
		}
		String[] lalongs = lalong.split(",");
		double latitude = Double.parseDouble(lalongs[0]);
		double longitude = Double.parseDouble(lalongs[1]);
		String imgPath;
		try {
			if(mFile.isEmpty()) imgPath = null;
			else imgPath = FileUtils.copyFileToPlace(sc, mFile.getInputStream(),mFile.getOriginalFilename());
		} catch (IOException e) {
			e.printStackTrace();
		}
		placeService.add(name, level, type, descript, latitude, longitude);
		return "admin/place/add";
	}
	
	@RequestMapping(value="/remove/handle",method=RequestMethod.POST)
	public String placeRemoveHandle(HttpServletRequest request){
		String path = request.getRequestURI();
		return "redirect:"+path;
	}
	
	@RequestMapping(value="/modify/handle",method=RequestMethod.POST)
	public String placeModifyHandle(@RequestParam("id")String id){
		return "redirect";
	}
	
}
