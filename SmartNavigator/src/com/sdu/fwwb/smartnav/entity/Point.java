package com.sdu.fwwb.smartnav.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sn_point")
public class Point implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7962213499915417060L;

	private long id;
	private String name;
	private double latitude;
	private double longitude;
	
	public Point(){}
	
	public Point(long id, String name, double latitude, double longitude) {
		this.id = id;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Point(String name,double latitude, double longitude) {
		this.name = name;
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
	
	@Column(name="point_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="point_latitude")
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Column(name="point_longitude")
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Point [id=" + id + ", name=" + name + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}
	
}
