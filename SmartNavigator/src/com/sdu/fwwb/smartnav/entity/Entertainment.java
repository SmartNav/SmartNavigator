package com.sdu.fwwb.smartnav.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sn_place_entertainment")
public class Entertainment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5974837792767477064L;
	
	private long id;
	private String name;
	private String tel;
	private String place;
	private int valuation;
	private String notice;
	private String description;
	private int level;
	private double latitude;
	private double longitude;
	
	public Entertainment(){}
	
	

	public Entertainment(long id, String name, String tel, String place,
			int valuation, String notice, String description, int level,
			double latitude, double longitude) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.place = place;
		this.valuation = valuation;
		this.notice = notice;
		this.description = description;
		this.level = level;
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
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="tel")
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Column(name="place")
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Column(name="valuation")
	public int getValuation() {
		return valuation;
	}
	public void setValuation(int valuation) {
		this.valuation = valuation;
	}
	@Column(name="notice")
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	@Column(name="description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name="level")
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Column(name="latitude")
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Column(name="longitude")
	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	
}
