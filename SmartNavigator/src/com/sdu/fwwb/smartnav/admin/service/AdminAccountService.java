package com.sdu.fwwb.smartnav.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdu.fwwb.smartnav.admin.dao.AdminDAO;
import com.sdu.fwwb.smartnav.admin.entity.Admin;
import com.sdu.fwwb.smartnav.dao.UserDAO;
import com.sdu.fwwb.smartnav.entity.User;
import com.sdu.fwwb.smartnav.exception.ErrorCodeDefinitions;
import com.sdu.fwwb.smartnav.exception.SmartNavError;
import com.sdu.fwwb.smartnav.exception.SmartNavException;
import com.sdu.fwwb.smartnav.util.ValidateUtil;

@Service
public class AdminAccountService {

	@Autowired
	AdminDAO adminDao;
	
	public void createAccount(String email,String password,String userName) throws SmartNavException{
		if(!ValidateUtil.isEmail(email) || !password.isEmpty() || userName.isEmpty()){
			throw new SmartNavException(new SmartNavError(ErrorCodeDefinitions.CODE_INVALID_INPUT));
		}
		Admin user = new Admin(userName,email,password);
		adminDao.save(user);
	}
	
	public Admin findByName(String name){
		return adminDao.findByName(name);
	}
	public Admin findByEmail(String email){
		return adminDao.findByEmail(email);
	}
	
	public boolean login(String name,String password){
		if(adminDao.findByNameAndPassword(name, password) != null){
			return true;
		}
		return false;
	}
}
