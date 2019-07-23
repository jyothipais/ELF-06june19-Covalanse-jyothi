package com.covalense.empspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/deligate")
public class RequestDelgationController {

	@GetMapping("/getHomePage")
	public String getHomePage() {
		return "/homePage";
	}// End of getHomepage
	@GetMapping("/forwardReq")
	public String forwardReq() {
		return "forward:/forms/getForm";
	}// End of getHomepage
	@GetMapping("/redirectReq")
	public String redirectReq() {
		return "redirect:https://www.google.com";
	}// End of getHomepage
}// End of Controller
