package com.covalense.employeemvc.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.employeemvc.dao.EmployeeDAO;
import com.covalense.employeemvc.dto.EmployeeAddressInfoBean;
import com.covalense.employeemvc.dto.EmployeeEducationInfo;
import com.covalense.employeemvc.dto.EmployeeExperienceInfo;
import com.covalense.employeemvc.dto.EmployeeInfoBean;
import com.covalense.employeemvc.dto.EmployeeOtherInfoBean;

import static com.covalense.employeemvc.common.EmpConstants.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/login")
@PropertySource(PROP_PROPERTYFILE)

public class LoginController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	CustomDateEditor editor=new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true);
	binder.registerCustomEditor(Date.class,editor);
		
	}

	@GetMapping("/loginPage")
	public String loginPage() {
		return VIEW_LOGINPAGE;
	}
	
	@GetMapping("/registration")
	public String registration() {
		return VIEW_REGISTRATION_INFO;
	}
	
	@PostMapping("/createEmployee")
	public String addEmployee(EmployeeInfoBean bean,ModelMap map,int managerId) {
		
		EmployeeInfoBean manInfoBean=dao.getEmployeeInfoBean(managerId);
		bean.setManagerId(manInfoBean);
		
		List<EmployeeEducationInfo> educationBeans=bean.getEducationInfo();
		for(EmployeeEducationInfo employeeEducationInfo:educationBeans) {
			employeeEducationInfo.getEducationPkBean().setEmployeeInfoBean(bean);
		}
		List<EmployeeAddressInfoBean> addressBeans=bean.getEmployeeAddressInfo();
		for(EmployeeAddressInfoBean employeeAddresBean:addressBeans) {
			employeeAddresBean.getAddressPKBean().setEmployeeInfoBean(bean);
		}
		List<EmployeeExperienceInfo> experienceBean=bean.getExperienceInfoBean();
		for(EmployeeExperienceInfo employeeExperienceBean:experienceBean) {
			employeeExperienceBean.getExperiencePkBean().setEmployeeInfoBean(bean);
		}
		EmployeeOtherInfoBean employeeOtherInfo=bean.getEmployeeOtherInfo();
		employeeOtherInfo.setEmployeeInfo(bean);
		
		boolean result=dao.createEmployeeInfoBean(bean);
		if(result) {
			map.addAttribute("msg","Employee addedd Successfully");
		}else {
			map.addAttribute("msg","Employee Insertion Failed");
		}
		return "/VIEW_LOGINPAGE";
	}
	
	
	
	
	
	
	
	@GetMapping("/search")
	public String search() {
		return VIEW_SEARCH;
	}

	@PostMapping("/authenticate")
	public String authenticate(int id, String password, HttpServletRequest request,
		@Value("${InvalidLogin}") String msg,
		@Value("${dbInteractionType}") String dbInteractionType) {
	EmployeeInfoBean bean = dao.getEmployeeInfoBean(id);
	if (bean.getPassword().equals(password) && bean.getId() == id) {
			HttpSession session = request.getSession(true);
			session.setAttribute("bean", bean);
			return VIEW_HOMEPAGE;
	}
		request.setAttribute("msg", msg);
	return VIEW_LOGINPAGE;
	}	
	
	@GetMapping("/logout")
	public String logout(HttpSession session,ModelMap map,@Value("${LogoutMessage}")
	String msg) {
		map.addAttribute("msg", msg);
		session.invalidate();	
		return VIEW_LOGINPAGE;
	}
	
}
