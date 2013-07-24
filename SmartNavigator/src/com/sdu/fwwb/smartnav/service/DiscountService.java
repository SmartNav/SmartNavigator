package com.sdu.fwwb.smartnav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdu.fwwb.smartnav.dao.DiscountDAO;
import com.sdu.fwwb.smartnav.entity.Discount;

@Service
public class DiscountService {
	
	@Autowired
	DiscountDAO discountDao;
	
	public List<Discount> listDiscountByPlaceId(long placeId){
		return discountDao.findByPlaceId(placeId);
	}
	
	@Transactional
	public void deleteDiscountByPlaceId(long placeId){
		discountDao.deleteByPlaceId(placeId);
	}
	
	@Transactional
	public void deleteDiscountById(long id){
		discountDao.delete(id);
	}
	
	@Transactional
	public void deleteDiscountByIds(List<Long> ids){
		for(long id :ids){
			discountDao.delete(id);
		}
	}
	
	@Transactional
	public void saveDiscount(Discount discount){
		discountDao.save(discount);
	}
	
	public Discount getDiscount(long id){
		return discountDao.findOne(id);
	}
	
	public List<Discount> getDiscountByPlaceId(long placeId){
		return discountDao.findByPlaceId(placeId);
	}
	
}
