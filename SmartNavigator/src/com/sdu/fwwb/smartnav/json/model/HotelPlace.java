package com.sdu.fwwb.smartnav.json.model;

import java.io.Serializable;

public class HotelPlace implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8484107880700145483L;
	
	private long id;
	private String name;
	private int level;
	private int type;
	private String description;
	private double latitude;
	private double longitude;
	private int star_level;
	private String min_price;
	private String max_price;
	private int empty_room;
	private int valuation;
	private String notice;
	private String tel;
	private String place;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public int getStar_level() {
		return star_level;
	}
	public void setStar_level(int star_level) {
		this.star_level = star_level;
	}
	public String getMin_price() {
		return min_price;
	}
	public void setMin_price(String min_price) {
		this.min_price = min_price;
	}
	public String getMax_price() {
		return max_price;
	}
	public void setMax_price(String max_price) {
		this.max_price = max_price;
	}
	public int getEmpty_room() {
		return empty_room;
	}
	public void setEmpty_room(int empty_room) {
		this.empty_room = empty_room;
	}
	public int getValuation() {
		return valuation;
	}
	public void setValuation(int valuation) {
		this.valuation = valuation;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "HotelPlace [id=" + id + ", name=" + name + ", level=" + level
				+ ", type=" + type + ", description=" + description
				+ ", latitude=" + latitude + ", longitude=" + longitude
				+ ", star_level=" + star_level + ", min_price=" + min_price
				+ ", max_price=" + max_price + ", empty_room=" + empty_room
				+ ", valuation=" + valuation + ", notice=" + notice + ", tel="
				+ tel + ", place=" + place + "]";
	}
	

}
