package com.sdu.fwwb.smartnav.service;

import java.util.List;

import com.sdu.fwwb.smartnav.dao.CommentDAO;
import com.sdu.fwwb.smartnav.entity.Comment;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

	private static final Logger log = Logger.getLogger(CommentService.class);
	
	@Autowired
	CommentDAO commentDao;
	
	public List<Comment> listByPlaceId(long placeId){
		return commentDao.findByPlaceId(placeId);
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
}
