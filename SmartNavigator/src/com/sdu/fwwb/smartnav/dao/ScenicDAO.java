package com.sdu.fwwb.smartnav.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sdu.fwwb.smartnav.entity.Scenic;

@Repository
public interface ScenicDAO extends CrudRepository<Scenic, Long>{
	public Page<Scenic> findAll(Pageable pageable);

}
