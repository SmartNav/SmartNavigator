package com.sdu.fwwb.smartnav.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sn_place_hotel")
public class Hotel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7378974997671436375L;

	private long id;
	private String name;
	private int star_level;
	private String min_price;
	private String max_price;
	private int empty_room;
	private int valuation;
	private String notice;
	private String tel;
	private String place;
	private String description;
	private int level;
	private double latitude;
	private double longitude;
	private String img;

	public Hotel(){}
	
	public Hotel(long id, String name, int star_level, String min_price,
			String max_price, int empty_room, int valuation, String notice,
			String tel, String place, String description, int level,
			double latitude, double longitude, String img) {
		super();
		this.id = id;
		this.name = name;
		this.star_level = star_level;
		this.min_price = min_price;
		this.max_price = max_price;
		this.empty_room = empty_room;
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
	@Column(name = "id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "star_level")
	public int getStar_level() {
		return star_level;
	}

	public void setStar_level(int star_level) {
		this.star_level = star_level;
	}

	@Column(name = "min_price")
	public String getMin_price() {
		return min_price;
	}

	public void setMin_price(String min_price) {
		this.min_price = min_price;
	}

	@Column(name = "max_price")
	public String getMax_price() {
		return max_price;
	}

	public void setMax_price(String max_price) {
		this.max_price = max_price;
	}

	@Column(name = "empty_room")
	public int getEmpty_room() {
		return empty_room;
	}

	public void setEmpty_room(int empty_room) {
		this.empty_room = empty_room;
	}

	@Column(name = "valuation")
	public int getValuation() {
		return valuation;
	}

	public void setValuation(int valuation) {
		this.valuation = valuation;
	}

	@Column(name = "notice")
	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	@Column(name = "tel")
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "place")
	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "level")
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Column(name = "latitude")
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude")
	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Column(name = "img")
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", star_level="
				+ star_level + ", min_price=" + min_price + ", max_price="
				+ max_price + ", empty_room=" + empty_room + ", valuation="
				+ valuation + ", notice=" + notice + ", tel=" + tel
				+ ", place=" + place + ", description=" + description
				+ ", level=" + level + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", img=" + img + "]";
	}
	
}
