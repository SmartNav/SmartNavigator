package com.sdu.fwwb.smartnav.json.model;

import java.util.List;

import com.sdu.fwwb.smartnav.entity.Discount;
import com.sdu.fwwb.smartnav.entity.Entertainment;
import com.sdu.fwwb.smartnav.entity.Hotel;

public class HotelAndDiscount {

	private Hotel hotel;
	private List<Discount> discounts;
	
	public HotelAndDiscount(Hotel hotel, List<Discount> discounts) {
		super();
		this.hotel = hotel;
		this.discounts = discounts;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public List<Discount> getDiscounts() {
		return discounts;
	}
	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}
	@Override
	public String toString() {
		return "HotelAndDiscount [hotel=" + hotel + ", discounts=" + discounts
				+ "]";
	}
	
}
