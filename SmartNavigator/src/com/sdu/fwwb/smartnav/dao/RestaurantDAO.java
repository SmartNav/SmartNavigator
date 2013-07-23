package com.sdu.fwwb.smartnav.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sdu.fwwb.smartnav.entity.Restaurant;

@Repository
public interface RestaurantDAO extends CrudRepository<Restaurant, Long>{
	public Page<Restaurant> findAll(Pageable pageable);
}
