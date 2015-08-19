package com.bit2015.springex.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit2015.springex.vo.UserVo;

@Controller
public class MCController {

	@RequestMapping("/mc/ex1")
	@ResponseBody
	public String ex1(){
		return "Hello Spring";
	}
	
	@RequestMapping("/mc/ex2")
	@ResponseBody
	public Object ex2(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("title", "선생님");
		map.put("name", "안대혁");
		map.put("institution", "비트");
		map.put("number", new Integer(100000));
		map.put("no", new Long(1));
		
		
		return map;
	}
	
	@RequestMapping("/mc/ex3")
	@ResponseBody
	public Object ex3(){
		UserVo vo = new UserVo();
		vo.setEmail("jerriegogo@naver.com");
		vo.setName("한제희");
		vo.setGender("male");
		vo.setNo(1);
		
		return vo;
	}
	
	@RequestMapping("/mc/ex4")
	@ResponseBody
	public Object ex4(){
		List<UserVo> list = new ArrayList<UserVo>();
		for(int i=0; i<3; i++){
			UserVo vo = new UserVo();
			vo.setEmail("jerriegogo" + i + "@naver.com");
			vo.setName("한제희" + i);
			vo.setGender("male");
			vo.setNo(i);
			
			list.add(vo);
		}
		
		return list;
	}
	
	@RequestMapping("/mc/ex5")
	@ResponseBody
	public Object ex5(){
		List<UserVo> list = new ArrayList<UserVo>();
		for(int i=0; i<3; i++){
			UserVo vo = new UserVo();
			vo.setEmail("jerriegogo" + i + "@naver.com");
			vo.setName("한제희" + i);
			vo.setGender("male");
			vo.setNo(i);
			
			list.add(vo);
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("number", new Integer(2000));
		map.put("list", list);
		
		return map;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
