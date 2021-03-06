package com.covalense.webapp.myservletapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.webapp.bean.EmployeeInfo;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//create obj for bean
		EmployeeInfo employeeInfo=new EmployeeInfo();
		employeeInfo.setID(33);
		employeeInfo.setNAME("poornima");
		employeeInfo.setAGE(30);
		
		//passing obj for Employeesearch
		//req.setAttribute("info",employeeInfo);
						//OR
		ServletContext context=getServletContext();
		context.setAttribute("info",employeeInfo);
		  
		//forwarding to particuler url
		String url = "search?id=3";
//		String url = "search";
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);

	}

}
