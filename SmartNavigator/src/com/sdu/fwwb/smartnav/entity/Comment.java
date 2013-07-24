package com.sdu.fwwb.smartnav.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sn_comments")
public class Comment {

	private long id;
	private long placeId;
	private long userId;
	private int star;
	private String content;
	
	public Comment(){};
	
	public Comment(long placeId, long userId, int star, String content) {
		super();
		this.placeId = placeId;
		this.userId = userId;
		this.star = star;
		this.content = content;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@Column(name="place_id")
	public long getPlaceId() {
		return placeId;
	}

	public void setPlaceId(long placeId) {
		this.placeId = placeId;
	}
	@Column(name="user_id")
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	@Column(name="star")
	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}
	@Column(name="content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", placeId=" + placeId + ", userId="
				+ userId + ", star=" + star + ", content=" + content + "]";
	}
	
	
	
}
