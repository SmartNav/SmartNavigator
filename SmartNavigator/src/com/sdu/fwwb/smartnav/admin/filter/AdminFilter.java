package com.sdu.fwwb.smartnav.admin.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.filter.OncePerRequestFilter;

import com.sdu.fwwb.smartnav.admin.entity.Admin;
import com.sdu.fwwb.smartnav.admin.util.AdminSessionManager;

public class AdminFilter extends OncePerRequestFilter{

	private static final Logger log = Logger.getLogger(AdminFilter.class);  
	
	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		//不过滤的uri
		String[] notFilter = new String[]{"login"};
		String uri = request.getRequestURI();
		if(uri.indexOf("admin") != -1){
			boolean doFilter = true;
			for(String s : notFilter){
				if(uri.indexOf(s) != -1){
					doFilter =false;
					break;
				}
			}
			if(doFilter){
				Admin admin = AdminSessionManager.getAdminFromSession(request.getSession());
				if(admin == null){
					ServletContext sc = getServletContext();
					response.sendRedirect(sc.getContextPath()+"/admin/login");
					log.debug("redirect:"+sc.getContextPath()+"/admin/login");
				}else{
					chain.doFilter(request, response);
				}
			}else{
				chain.doFilter(request, response);
			}
		}else{
			chain.doFilter(request, response);
		}
	}

}
