package com.sdu.fwwb.smartnav.json.model;

import java.util.List;

import com.sdu.fwwb.smartnav.entity.Activity;
import com.sdu.fwwb.smartnav.entity.Place;

public class PlaceAndActivity {

	private Place place;
	private List<Activity> activities;

	public PlaceAndActivity(){};
	public PlaceAndActivity(Place place, List<Activity> activities) {
		super();
		this.place = place;
		this.activities = activities;
	}
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	public List<Activity> getActivities() {
		return activities;
	}
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
	@Override
	public String toString() {
		return "PlaceAndActivity [place=" + place + ", activities="
				+ activities + "]";
	}
	
	
}
