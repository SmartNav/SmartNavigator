package com.sdu.fwwb.smartnav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdu.fwwb.smartnav.dao.UserDAO;
import com.sdu.fwwb.smartnav.entity.User;
import com.sdu.fwwb.smartnav.exception.ErrorCodeDefinitions;
import com.sdu.fwwb.smartnav.exception.SmartNavError;
import com.sdu.fwwb.smartnav.exception.SmartNavException;
import com.sdu.fwwb.smartnav.util.ValidateUtil;

@Service
public class AccountService {

	@Autowired
	UserDAO userDao;
	
	public void createAccount(String email,String password,String userName) throws SmartNavException{
		if(!ValidateUtil.isEmail(email) || !password.isEmpty() || userName.isEmpty()){
			throw new SmartNavException(new SmartNavError(ErrorCodeDefinitions.CODE_INVALID_INPUT));
		}
		User user = new User(userName,email,password);
		userDao.save(user);
	}
	
}
