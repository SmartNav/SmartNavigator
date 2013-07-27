package com.sdu.fwwb.smartnav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdu.fwwb.smartnav.dao.ActivityUserRecordDAO;
import com.sdu.fwwb.smartnav.entity.ActivityUserRecord;

@Service
public class ActivityUserRecordService {

	@Autowired
	ActivityUserRecordDAO aurDao;
	
	public boolean isExists(long activityId,long userId){
		return aurDao.findByActivityIdAndUserId(activityId, userId) != null;
	}
	
	public void save(ActivityUserRecord aur){
		aurDao.save(aur);
	}
	
}
