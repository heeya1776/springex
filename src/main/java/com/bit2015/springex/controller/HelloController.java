package com.bit2015.springex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.bit2015.springex.dao.HelloDao;

@Controller
public class HelloController {
	
	@Autowired
	private HelloDao helloDao;
	
	@RequestMapping("/hello2")
	public String hello2(HttpServletRequest request){
		
		WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
		
		HelloDao helloDao = (HelloDao)wac.getBean("helloDao");
		helloDao.hello();
		
		
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(required=false, defaultValue="", value="id") String id, Model model){
		
		helloDao.hello();
		
		model.addAttribute("id", id);
		
		return "/WEB-INF/views/index.jsp";
		
	}
}
