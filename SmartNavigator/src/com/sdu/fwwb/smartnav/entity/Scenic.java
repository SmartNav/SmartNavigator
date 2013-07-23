package com.sdu.fwwb.smartnav.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sn_place_scenic")
public class Scenic implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1541275124341323277L;
	
	private long id;
	private String name;
	private int star;
	private String place;
	private int valuation;
	private String description;

	private int level;
	private double latitude;
	private double longitude;
	private String img;
	
	public Scenic() {}

	public Scenic(long id, String name, int star, String place, int valuation,
			String description, int level, double latitude, double longitude,
			String img) {
		super();
		this.id = id;
		this.name = name;
		this.star = star;
		this.place = place;
		this.valuation = valuation;
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
	@Column(name="level")
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
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
	@Column(name="description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name="star")
	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
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

	@Column(name="img")
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Scenic [id=" + id + ", name=" + name + ", star=" + star
				+ ", place=" + place + ", valuation=" + valuation
				+ ", description=" + description + ", level=" + level
				+ ", latitude=" + latitude + ", longitude=" + longitude
				+ ", img=" + img + "]";
	}

}
