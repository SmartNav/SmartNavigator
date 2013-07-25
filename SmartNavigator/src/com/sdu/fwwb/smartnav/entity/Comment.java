package com.sdu.fwwb.smartnav.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="sn_comments")
public class Comment {

	private long id;
	private long placeId;
	private long userId;
	private int star;
	private String content;
	private Date postTime;
	
	public Comment(){};
	
	public Comment(long placeId, long userId, int star, String content) {
		super();
		this.placeId = placeId;
		this.userId = userId;
		this.star = star;
		this.content = content;
	}
	public Comment(long id, long placeId, long userId, int star,
			String content, Date postTime) {
		super();
		this.id = id;
		this.placeId = placeId;
		this.userId = userId;
		this.star = star;
		this.content = content;
		this.postTime = postTime;
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

	@Column(name="post_time")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", placeId=" + placeId + ", userId="
				+ userId + ", star=" + star + ", content=" + content
				+ ", postTime=" + postTime + "]";
	}
	
}
