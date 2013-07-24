package com.sdu.fwwb.smartnav.algorithm;

import com.sdu.fwwb.smartnav.entity.Point;

public class CalDistence {
	
//	double lat1, lng1, lat2, lng2;
//	
//	public void init(double lat1, double lng1, double lat2, double lng2){
//		lat1 = lat1 * Math.PI / 180.0;
//		lng1 = lng1 * Math.PI / 180.0;
//		lat2 = lat2 * Math.PI / 180.0;
//		lng2 = lng2 * Math.PI / 180.0;
//	}
	
	public double ang(double lat1, double lng1, double lat2, double lng2){
		return Math.acos(Math.cos(lat1) * Math.cos(lat2) * Math.cos(lng1-lng2) + Math.sin(lat1) * Math.sin(lat2));
	}

	public double dis_line(double lat1, double lng1, double lat2, double lng2, double r){
		return r * Math.sqrt(2-2*(Math.cos(lat1) * Math.cos(lat2) * Math.cos(lng1-lng2) + Math.sin(lat1) * Math.sin(lat2)));
	}

	public double dis_sphere(double lat1, double lng1, double lat2, double lng2, double r){
		return r * ang(lat1, lng1, lat2, lng2);
	}
	
	public double cal(Point p1, Point p2){
		double lat1 = p1.getLatitude();
		double lng1 = p1.getLongitude();
		double lat2 = p2.getLatitude();
		double lng2 = p2.getLongitude();
		lat1 = lat1 * Math.PI / 180.0;
		lng1 = lng1 * Math.PI / 180.0;
		lat2 = lat2 * Math.PI / 180.0;
		lng2 = lng2 * Math.PI / 180.0;
		return dis_sphere(lat1, lng1, lat2, lng2, 6370);
	}
}
