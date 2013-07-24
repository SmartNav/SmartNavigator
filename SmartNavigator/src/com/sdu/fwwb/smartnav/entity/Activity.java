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
@Table(name="sn_activity")
public class Activity {

	private long id;
	private long placeId;
	private String title;
	private String shortDes;
	private String content;
	private Date startTime;
	private Date endTime;
	
	public Activity(){};
	
	public Activity(long placeId, String title, String shortDes,
			String content, Date startTime, Date endTime) {
		super();
		this.placeId = placeId;
		this.title = title;
		this.shortDes = shortDes;
		this.content = content;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Activity(long id, long placeId, String title, String shortDes,
			String content, Date startTime, Date endTime) {
		super();
		this.id = id;
		this.placeId = placeId;
		this.title = title;
		this.shortDes = shortDes;
		this.content = content;
		this.startTime = startTime;
		this.endTime = endTime;
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
	@Column(name="title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name="short_des")
	public String getShortDes() {
		return shortDes;
	}
	public void setShortDes(String shortDes) {
		this.shortDes = shortDes;
	}
	@Column(name="content")
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_time")
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "Activity [id=" + id + ", placeId=" + placeId + ", title="
				+ title + ", shortDes=" + shortDes + ", content=" + content
				+ ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
}
