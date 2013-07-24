package com.sdu.fwwb.smartnav.json.model;

import java.io.Serializable;

import com.sdu.fwwb.smartnav.entity.Comment;
import com.sdu.fwwb.smartnav.entity.User;

public class CommentAndUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4862750054598338517L;

	private Comment comment;
	private User user;
	public CommentAndUser(){};
	
	public CommentAndUser(Comment comment, User user) {
		this.comment = comment;
		this.user = user;
	}

	public Comment getComment() {
		return comment;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "CommentAndUser [comment=" + comment + ", user=" + user + "]";
	}
	
}
