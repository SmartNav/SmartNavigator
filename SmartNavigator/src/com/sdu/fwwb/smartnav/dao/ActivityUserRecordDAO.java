package com.sdu.fwwb.smartnav.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sdu.fwwb.smartnav.entity.Activity;
import com.sdu.fwwb.smartnav.entity.ActivityUserRecord;

@Repository
public interface ActivityUserRecordDAO extends CrudRepository<ActivityUserRecord, Long>{

	public ActivityUserRecord findByActivityIdAndUserId(long activityId,long userId);
}
