package com.sdu.fwwb.smartnav.json.model;

import java.util.List;

import com.sdu.fwwb.smartnav.entity.Discount;
import com.sdu.fwwb.smartnav.entity.Entertainment;

public class EntertainmentAndDiscount {

	private Entertainment entertainment;
	private List<Discount> discounts;
	
	public EntertainmentAndDiscount(Entertainment entertainment,
			List<Discount> discounts) {
		super();
		this.entertainment = entertainment;
		this.discounts = discounts;
	}
	public Entertainment getEntertainment() {
		return entertainment;
	}
	public void setEntertainment(Entertainment entertainment) {
		this.entertainment = entertainment;
	}
	public List<Discount> getDiscounts() {
		return discounts;
	}
	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}
	@Override
	public String toString() {
		return "EntertainmentAndDiscount [entertainment=" + entertainment
				+ ", discounts=" + discounts + "]";
	}
	
	
}
