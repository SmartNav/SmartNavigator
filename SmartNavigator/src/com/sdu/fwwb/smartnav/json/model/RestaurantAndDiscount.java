package com.sdu.fwwb.smartnav.json.model;

import java.util.List;

import com.sdu.fwwb.smartnav.entity.Discount;
import com.sdu.fwwb.smartnav.entity.Entertainment;
import com.sdu.fwwb.smartnav.entity.Hotel;
import com.sdu.fwwb.smartnav.entity.Restaurant;

public class RestaurantAndDiscount {

	private Restaurant restaurant;
	private List<Discount> discounts;
	
	public RestaurantAndDiscount(Restaurant restaurant, List<Discount> discounts) {
		super();
		this.restaurant = restaurant;
		this.discounts = discounts;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public List<Discount> getDiscounts() {
		return discounts;
	}
	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}
	@Override
	public String toString() {
		return "RestaurantAndDiscount [restaurant=" + restaurant
				+ ", discounts=" + discounts + "]";
	}
	
}
