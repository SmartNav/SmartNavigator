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
	private int level;
	private String place;
	private int valuation;
	private String description;
	
	
	public Scenic() {}

	public Scenic(long id, String name, int level, String place, int valuation,
			String description) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.place = place;
		this.valuation = valuation;
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

	@Override
	public String toString() {
		return "Scenic [id=" + id + ", name=" + name + ", level=" + level
				+ ", place=" + place + ", valuation=" + valuation
				+ ", description=" + description + "]";
	}
	
}
