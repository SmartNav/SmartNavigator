package com.sdu.fwwb.smartnav.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sn_dist")
public class Dist implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4353534503000982258L;
	
	private long id;
	private int start;
	private int end;
	private double weight;
	
	public Dist(){}

	public Dist(long id, int start, int end, double weight) {
		this.id = id;
		this.start = start;
		this.end = end;
		this.weight = weight;
	}

	@Id
	@Column(name="id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@Column(name="start")
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}
	@Column(name="end")
	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	@Column(name="weight")
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dist [id=" + id + ", start=" + start + ", end=" + end
				+ ", weight=" + weight + "]";
	}
}
