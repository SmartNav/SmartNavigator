package com.sdu.fwwb.smartnav.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sn_place_other")
public class other implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2404112240721006299L;

	private long id;
	private String name;
	private String place;
	private String description;
	
	public other() {}

	public other(long id, String name, String place, String description) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.description = description;
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

	@Override
	public String toString() {
		return "other [id=" + id + ", name=" + name + ", place=" + place
				+ ", description=" + description + "]";
	}
	
	
}
