package com.sdu.fwwb.smartnav.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sn_activity_user")
public class ActivityUserRecord {

	private long id;
	private long activityId;
	private long userId;
	private Date postDate;
	
	public ActivityUserRecord(){}
	
	public ActivityUserRecord(long activityId, long userId) {
		super();
		this.activityId = activityId;
		this.userId = userId;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="activity_id")
	public long getActivityId() {
		return activityId;
	}
	public void setActivityId(long activityId) {
		this.activityId = activityId;
	}
	@Column(name="user_id")
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	@Column(name="post_date")
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	@Override
	public String toString() {
		return "ActivityUserRecord [id=" + id + ", activityId=" + activityId
				+ ", userId=" + userId + ", postDate=" + postDate + "]";
	}
	
}
