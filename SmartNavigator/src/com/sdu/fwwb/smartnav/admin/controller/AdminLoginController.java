package com.sdu.fwwb.smartnav.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sdu.fwwb.smartnav.admin.entity.Admin;
import com.sdu.fwwb.smartnav.admin.service.AdminAccountService;
import com.sdu.fwwb.smartnav.admin.util.AdminSessionManager;


@Controller
@RequestMapping(value ="/admin")
public class AdminLoginController {
	
	@Autowired
	AdminAccountService adminAccountService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		String name=request.getParameter("name");
		String pwd = request.getParameter("password");
		if( name != null && !name.isEmpty() && pwd != null &&!pwd.isEmpty()){
			if(adminAccountService.login(name,pwd)){
				Admin admin = adminAccountService.findByName(name);
				AdminSessionManager.writeAdminToSession(request.getSession(), admin);
				return "redirect:/admin/index";
			}else{
				return "redirect:/admin/login?error=true";
			}
		}
		return "admin/login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		Admin admin = AdminSessionManager.getAdminFromSession(session);
		admin = null;
		AdminSessionManager.writeAdminToSession(session, null);
		return "admin/login";
	}
	
	@RequestMapping("/modify")
	public String modify(){
		return "admin/modify";
	}
	
	@RequestMapping("/modify/handle")
	public String modifyHandle(@RequestParam("oldpassword")String op,@RequestParam("password1")String np,HttpSession session){
		Admin admin= adminAccountService.findByEmail(AdminSessionManager.getAdminFromSession(session).getEmail());
		if(op.equals(admin.getPassword())){
			adminAccountService.updatePassword(admin,np);
			return "redirect:/admin/modify?success=true";
		}
		return "redirect:/admin/modify?error=true";
	}
}
