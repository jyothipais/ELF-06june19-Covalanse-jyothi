package com.covalense.employeemvc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.employeemvc.dao.EmployeeDAO;
import com.covalense.employeemvc.dto.EmployeeAddressInfoBean;
import com.covalense.employeemvc.dto.EmployeeEducationInfo;
import com.covalense.employeemvc.dto.EmployeeExperienceInfo;
import com.covalense.employeemvc.dto.EmployeeInfoBean;
import com.covalense.employeemvc.dto.EmployeeOtherInfoBean;

@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	
	@GetMapping("/search")
	public String searchEmployee(int id,HttpSession session,ModelMap map) {
		EmployeeInfoBean bean=dao.getEmployeeInfoBean(id);
			map.addAttribute("bean",bean);
			return "VIEW_SEARCH_PAGE";
		
	}

	

}
