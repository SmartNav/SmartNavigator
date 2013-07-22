package com.sdu.fwwb.smartnav.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sn_place_meta")
public class Place implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4293107920979469026L;

	private long id;
	private String name;
	private int level;
	private int type;
	private String description;
	private double latitude;
	private double longitude;
	
	public Place(){};
	
	public Place(long id, String name, int level, int type, String description,
			double latitude, double longitude) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.type = type;
		this.description = description;
		this.latitude = latitude;
		this.longitude = longitude;
	}



	public Place(String name, int level, int type, String description,
			double latitude, double longitude) {
		super();
		this.name = name;
		this.level = level;
		this.type = type;
		this.description = description;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	@Id
	@Column(name="id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="place_name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="place_level")
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Column(name="place_type")
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Column(name="place_descript")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="place_latitude")
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	@Column(name="place_longitude")
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	@Override
	public String toString() {
		return "Place [id=" + id + ", name=" + name + ", level=" + level
				+ ", type=" + type + ", description=" + description
				+ ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
}
