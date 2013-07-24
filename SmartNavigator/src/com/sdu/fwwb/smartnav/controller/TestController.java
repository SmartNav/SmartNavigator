package com.sdu.fwwb.smartnav.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.sdu.fwwb.smartnav.util.FileUtils;

@Controller
public class TestController {

	private static final Logger log = Logger.getLogger(TestController.class);
	
	@Autowired
	ServletContext sc;
	
	@RequestMapping("/index")
	public String index(){
		return "test";
	}
	
	@RequestMapping(value = "/upload")
	@ResponseBody
	// 将文件上传请求映射到该方法
	public String handleFormUpload(// 设置请求参数的名称和类型
			@RequestParam("file") MultipartFile mFile) { // 请求参数一定要与form中的参数名对应
		log.debug("exec..");
		log.debug("mFile:"+mFile.getName());
        System.out.println("上传文件：" + mFile.getOriginalFilename());
        if (!mFile.isEmpty()) {
            try {
				FileUtils.copyFileToPlace(sc,mFile.getInputStream(), mFile.getOriginalFilename());
			} catch (IOException e) {
				e.printStackTrace();
				return "failed";
			}
        }
		return "success";
	}
	
}
