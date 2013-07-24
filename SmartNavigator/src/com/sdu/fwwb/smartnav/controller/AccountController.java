package com.sdu.fwwb.smartnav.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sdu.fwwb.smartnav.entity.Comment;
import com.sdu.fwwb.smartnav.entity.User;
import com.sdu.fwwb.smartnav.service.AccountService;
import com.sdu.fwwb.smartnav.service.CommentService;
import com.sdu.fwwb.smartnav.util.FileUtils;
import com.sdu.fwwb.smartnav.util.UserSessionManager;


@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@Autowired
	ServletContext sc;
	
	@Autowired
	CommentService commentService;
	
	@RequestMapping("/register")
	@ResponseBody
	public String register(@RequestParam("email")String email,@RequestParam("password")String password,
			@RequestParam("name")String userName,@RequestParam("sex")String sex,@RequestParam("avatar") MultipartFile mFile){
		String avatar;
		if(FileUtils.isImg(mFile.getOriginalFilename())){
			try {
				avatar = FileUtils.copyFileToAvatar(sc, mFile.getInputStream(), mFile.getOriginalFilename());
				accountService.createAccount(email, password, userName, avatar, sex);
			} catch (IOException e) {
				e.printStackTrace();
				return "failed";
			} catch(Exception ex){
				ex.printStackTrace();
				return "failed";
			}
		}
		return "success";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(@RequestParam("email")String email,@RequestParam("password") String password,HttpSession session){
		if(accountService.login(email,password)){
			User user = accountService.get(email);
			UserSessionManager.saveUserToSession(session, user);
			return "success";
		}else{
			return "failed";
		}
	}
	
	@RequestMapping("/comment/add")
	@ResponseBody
	public String comment(@RequestParam("placeid")long placeId,@RequestParam("content")String content,
			@RequestParam("star") int star,HttpSession session){
		User user  = UserSessionManager.getUserFromSession(session);
		Comment comment = new Comment(placeId, user.getId(), star, content);
		commentService.save(comment);
		return "success";
	}
	
	@RequestMapping("/comment/delete")
	@ResponseBody
	public String comment(@RequestParam("id")long id,HttpSession session){
		User user  = UserSessionManager.getUserFromSession(session);
		Comment comment = commentService.get(id);
		if(comment.getUserId() == user.getId()){
			commentService.delete(comment);
			return "success";
		}
		return "not authrized";
	}
	
}
