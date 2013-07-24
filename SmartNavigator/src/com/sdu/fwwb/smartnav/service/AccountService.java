package com.sdu.fwwb.smartnav.service;

import org.apache.log4j.Logger;
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

	private static final Logger log = Logger.getLogger(AccountService.class);
	
	@Autowired
	UserDAO userDao;
	
	public void createAccount(String email,String password,String userName,String avatar,String sex) throws SmartNavException{
		if(!ValidateUtil.isEmail(email) || password.isEmpty() || userName.isEmpty()){
			throw new SmartNavException(new SmartNavError(ErrorCodeDefinitions.CODE_INVALID_INPUT));
		}
		User user = new User(userName,email,password,avatar,sex);
		userDao.save(user);
	}
	
	public boolean login(String email,String password){
		User user = userDao.findByEmailAndPassword(email,password);
		log.debug("user:"+user);
		return  user != null;
	}
	
	public User get(String email){
		return userDao.findByEmail(email);
	}
	
}
