package com.sdu.fwwb.smartnav.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sdu.fwwb.smartnav.entity.Comment;

@Repository
public interface CommentDAO extends CrudRepository<Comment, Long>{

	public List<Comment> findByPlaceId(long placeId);
	
}
