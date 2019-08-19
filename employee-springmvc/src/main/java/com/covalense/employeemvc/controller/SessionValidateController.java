package com.covalense.employeemvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.covalense.employeemvc.common.EmpConstants.*;

@RequestMapping("/validator")
public class SessionValidateController {
	
	@GetMapping("/validate{url1}/{url2}")
	public String validate(HttpSession session,ModelMap map,
			@PathVariable("url1") String url1,
			@PathVariable("url2") String url2,
			@Value("${sessionvalidate}")String msg) {
		if(session.isNew()){
			map.addAttribute("msg",msg);
			return VIEW_LOGINPAGE;
		}
		return "forward:"+url1+"/"+url2;	
	}
	@PostMapping("/validate")
	public String validateSessionForPost(HttpSession session,ModelMap map,
			@PathVariable("url1") String url1,
			@PathVariable("url2") String url2,
			@Value("${sessionvalidate}")String msg) {
		return validateSessionForPost(session, map, url1,url2,msg);
	}
}
