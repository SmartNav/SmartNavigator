package com.sdu.fwwb.smartnav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdu.fwwb.smartnav.dao.ActivityDAO;
import com.sdu.fwwb.smartnav.entity.Activity;
import com.sdu.fwwb.smartnav.entity.Activity;
@Service
public class ActivityService {
	
	@Autowired
	ActivityDAO activityDao;
	
	public List<Activity> listActivityByPlaceId(long placeId){
		return activityDao.findByPlaceId(placeId);
	}
	
	@Transactional
	public void deleteActivityByPlaceId(long placeId){
		activityDao.deleteByPlaceId(placeId);
	}
	
	@Transactional
	public void deleteActivityById(long id){
		activityDao.delete(id);
	}
	
	@Transactional
	public void deleteActivityByIds(List<Long> ids){
		for(long id :ids){
			activityDao.delete(id);
		}
	}
	
	@Transactional
	public void saveActivity(Activity activity){
		activityDao.save(activity);
	}
	
	public Activity getActivity(long id){
		return activityDao.findOne(id);
	}
	
	public List<Activity> getActivityByPlaceId(long placeId){
		return activityDao.findByPlaceId(placeId);
	}
	
}
