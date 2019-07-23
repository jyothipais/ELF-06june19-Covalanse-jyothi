package com.covalense.empspringmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/cookie")
public class CookieController {
	@GetMapping("/getCoockiePage")
	public String CoockiePage() {
		return "cookiepage";
	}
	
	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse response,ModelMap map){
		Cookie cookie=new Cookie("name","joy");
		response.addCookie(cookie);
		map.addAttribute("msg", "Cookie Addeed successFully");
		return "cookiepage";
	}
	@GetMapping("/readCookie")
	public String readCookie(@CookieValue(name="name")String name,ModelMap map) {
		map.addAttribute("msg1",name);
		return "cookiepage";
	}

}
