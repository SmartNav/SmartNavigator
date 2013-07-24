package com.sdu.fwwb.smartnav.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sdu.fwwb.smartnav.entity.OtherPlace;

@Repository
public interface OtherPlaceDAO extends CrudRepository<OtherPlace, Long>{

	public Page<OtherPlace> findAll(Pageable pageable);
	
}
