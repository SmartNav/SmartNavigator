package com.sdu.fwwb.smartnav.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sdu.fwwb.smartnav.dao.CommentDAO;
import com.sdu.fwwb.smartnav.dao.EntertainmentDAO;
import com.sdu.fwwb.smartnav.dao.HotelDAO;
import com.sdu.fwwb.smartnav.dao.PlaceDAO;
import com.sdu.fwwb.smartnav.dao.RestaurantDAO;
import com.sdu.fwwb.smartnav.dao.ScenicDAO;
import com.sdu.fwwb.smartnav.entity.Comment;
import com.sdu.fwwb.smartnav.entity.Place;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommentService {

	private static final Logger log = Logger.getLogger(CommentService.class);
	
	@Autowired
	CommentDAO commentDao;
	
	@Autowired
	PlaceDAO placeDao;
	
	@Autowired
	HotelDAO hotelDao;
	
	@Autowired
	RestaurantDAO restaurantDao;
	
	@Autowired
	ScenicDAO scenicDao;
	
	@Autowired
	EntertainmentDAO entertainmentDao;
	
	
	public List<Comment> listByPlaceId(long placeId){
		 List<Comment> comments = commentDao.findByPlaceId(placeId);
		 Collections.sort(comments, new DateComparator());
		 return comments;
	}
	
	public void save(Comment comment){
		commentDao.save(comment);
		log.debug("save comment:"+comment);
	}
	
	public void delete(long id){
		commentDao.delete(id);
	}
	
	public void delete(Comment comment){
		commentDao.delete(comment);
	}
	
	public Comment get(long id){
		return commentDao.findOne(id);
	}
	/**
	 * @return -1 if no comment found*/
	public int getStar(long placeId){
		int star = -1;
		try{
			 star = (int)Math.round(commentDao.findByPlaceIdAvg(placeId));
		}catch(Exception e){
			e.printStackTrace();
		}
		return star;
	}
	
	public static class DateComparator implements Comparator<Comment>{
		//compare result:newest comment > older comment
		@Override
		public int compare(Comment o1, Comment o2) {
			return o2.getPostTime().compareTo(o1.getPostTime());
		}
	}
}

