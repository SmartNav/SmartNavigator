
package com.sdu.fwwb.smartnav.json.model;

import java.io.Serializable;
import java.util.ArrayList;

import com.sdu.fwwb.smartnav.entity.Place;
import com.sdu.fwwb.smartnav.entity.Point;

public class Path implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1849751089972870287L;
	
	ArrayList<Point> plist;
	double dis;
	ArrayList<Place> list;
	

	public ArrayList<Place> getList() {
		return list;
	}

	public void setList(ArrayList<Place> list) {
		this.list = list;
	}

	public ArrayList<Point> getPlist() {
		return plist;
	}

	public void setPlist(ArrayList<Point> plist) {
		this.plist = plist;
	}

	public double getDis() {
		return dis;
	}

	public void setDis(double dis) {
		this.dis = dis;
	}

	@Override
	public String toString() {
		return "Path [plist=" + plist + ", dis=" + dis + ", list=" + list + "]";
	}

}