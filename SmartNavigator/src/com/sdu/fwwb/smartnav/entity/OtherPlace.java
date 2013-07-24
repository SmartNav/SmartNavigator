package com.sdu.fwwb.smartnav.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sn_place_other")
public class OtherPlace implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2404112240721006299L;

	private long id;
	private String name;
	private String place;
	private String description;
	private int level;
	private double latitude;
	private double longitude;
	private String img;
	
	public OtherPlace(){};
	
	public OtherPlace(long id, String name, String place, String description,
			int level, double latitude, double longitude, String img) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.description = description;
		this.level = level;
		this.latitude = latitude;
		this.longitude = longitude;
		this.img = img;
	}

	@Id
	@Column(name="id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="place")
	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	@Column(name="description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "OtherPlace [id=" + id + ", name=" + name + ", place=" + place
				+ ", description=" + description + ", level=" + level
				+ ", latitude=" + latitude + ", longitude=" + longitude
				+ ", img=" + img + "]";
	}

	
	
}
