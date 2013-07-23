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
	private String point_name;
	private double point_latitude;
	private double point_longitude;
	private String adj_points;
	
	public Point(){}
	
	public Point(long id, String point_name, double point_latitude,
			double point_longitude, String adj_points) {
		this.id = id;
		this.point_name = point_name;
		this.point_latitude = point_latitude;
		this.point_longitude = point_longitude;
		this.adj_points = adj_points;
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
	public String getPoint_name() {
		return point_name;
	}

	public void setPoint_name(String point_name) {
		this.point_name = point_name;
	}
	@Column(name="point_latitude")
	public double getPoint_latitude() {
		return point_latitude;
	}

	public void setPoint_latitude(double point_latitude) {
		this.point_latitude = point_latitude;
	}
	@Column(name="point_longtitude")
	public double getPoint_longitude() {
		return point_longitude;
	}

	public void setPoint_longitude(double point_longitude) {
		this.point_longitude = point_longitude;
	}
	@Column(name="adj_points")
	public String getAdj_points() {
		return adj_points;
	}

	public void setAdj_points(String adj_points) {
		this.adj_points = adj_points;
	}

	@Override
	public String toString() {
		return "Point [id=" + id + ", point_name=" + point_name
				+ ", point_latitude=" + point_latitude + ", point_longitude="
				+ point_longitude + ", adj_points=" + adj_points + "]";
	}
	
}
