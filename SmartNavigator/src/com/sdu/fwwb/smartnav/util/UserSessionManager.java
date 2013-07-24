package com.sdu.fwwb.smartnav.util;

import javax.servlet.http.HttpSession;

import com.sdu.fwwb.smartnav.entity.User;

public class UserSessionManager {

	private static final String USER = "user";
	
	public static User getUserFromSession(HttpSession session){
		return (User) session.getAttribute(USER);
	}
	
	public static void saveUserToSession(HttpSession session,User user){
		session.setAttribute(USER, user);
	}
	
}
