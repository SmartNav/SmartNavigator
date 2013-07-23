package com.sdu.fwwb.smartnav.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sdu.fwwb.smartnav.entity.Dist;


@Repository
public interface DistDao extends CrudRepository<Dist, Long>{
	
}
