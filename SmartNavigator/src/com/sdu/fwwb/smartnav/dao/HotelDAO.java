package com.sdu.fwwb.smartnav.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sdu.fwwb.smartnav.entity.Hotel;

@Repository
public interface HotelDAO extends CrudRepository<Hotel, Long>{

	public Page<Hotel> findAll(Pageable pageable);
}
