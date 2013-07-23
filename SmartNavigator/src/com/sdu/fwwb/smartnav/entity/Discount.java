package com.sdu.fwwb.smartnav.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sn_discount")
public class Discount implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8528879796144166942L;

	private long id;
	private long placeId;
	private String title;
	private String content;
	private int priority;
	
	public Discount(){}
	
	public Discount(long placeId, String title, String content, int priority) {
		super();
		this.placeId = placeId;
		this.title = title;
		this.content = content;
		this.priority = priority;
	}

	public Discount(long id, long placeId, String title, String content,
			int priority) {
		super();
		this.id = id;
		this.placeId = placeId;
		this.title = title;
		this.content = content;
		this.priority = priority;
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
	@Column(name="content")
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Column(name="priority")
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Discount [id=" + id + ", placeId=" + placeId + ", title="
				+ title + ", content=" + content + ", priority=" + priority
				+ "]";
	}
	
}
