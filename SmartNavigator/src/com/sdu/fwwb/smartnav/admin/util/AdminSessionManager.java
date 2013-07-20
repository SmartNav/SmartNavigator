package com.sdu.fwwb.smartnav.admin.util;

import javax.servlet.http.HttpSession;

import com.sdu.fwwb.smartnav.admin.entity.Admin;

public class AdminSessionManager {

	private static final String ADMIN="admin";
	
	public static void writeAdminToSession(HttpSession session,Admin admin){
		session.setAttribute(ADMIN, admin);
	}
	
	public static Admin getAdminFromSession(HttpSession session){
		Admin admin =  (Admin) session.getAttribute(ADMIN) ;
		return admin;
	}
}
