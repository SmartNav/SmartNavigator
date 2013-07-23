package com.sdu.fwwb.smartnav.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sn_place_restaurant")
public class Restaurant implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1798960085466597414L;
	
	private long id;
	private String name;
	private String avg_price;
	private String flavor;
	private int valuation;
	private String notice;
	private String tel;
	private String place;
	private String description;

	private int level;
	private double latitude;
	private double longitude;
	private String img;
	
	public Restaurant(){}

	public Restaurant(long id, String name, String avg_price, String flavor,
			int valuation, String notice, String tel, String place,
			String description, int level, double latitude, double longitude,
			String img) {
		super();
		this.id = id;
		this.name = name;
		this.avg_price = avg_price;
		this.flavor = flavor;
		this.valuation = valuation;
		this.notice = notice;
		this.tel = tel;
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
	@Column(name="avg_price")
	public String getAvg_price() {
		return avg_price;
	}

	public void setAvg_price(String avg_price) {
		this.avg_price = avg_price;
	}
	@Column(name="flavor")
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
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
	@Column(name="img")
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", avg_price="
				+ avg_price + ", flavor=" + flavor + ", valuation=" + valuation
				+ ", notice=" + notice + ", tel=" + tel + ", place=" + place
				+ ", description=" + description + ", level=" + level
				+ ", latitude=" + latitude + ", longitude=" + longitude
				+ ", img=" + img + "]";
	}
	
}
