package com.covalense.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.emp.bean.EmployeeInfo;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * if (request.getCookies() == null) {
		 * request.getRequestDispatcher("cookiedisabled.html").include(request,
		 * response); return; }
		 */
		 
		String idValue = request.getParameter("employeeid");
		String passwordValue = request.getParameter("password");
		boolean loginSuccess = false;
		
		EmployeeDAO dao = EmployeeDAOFactory.getinstance();
		EmployeeInfo bean = dao.getEmployeeInfo(idValue);
		
		PrintWriter out = response.getWriter();
		
		if (bean.getPASSWORD().equals(passwordValue) && bean.getID() == Integer.parseInt(idValue)) {
			
			  HttpSession session = request.getSession(true);
			  session.setAttribute("empdata", bean);
			
			 RequestDispatcher dispatcher = null;
			  response.setContentType("text/html");
			  dispatcher = request.getRequestDispatcher("homepage.jsp");
			  dispatcher.include(request, response);
		}else {

			  RequestDispatcher dispatcher = null;
			  response.setContentType("text/html");
			  dispatcher = request.getRequestDispatcher("loginfail.jsp?msg=Invalid User id and password");
			  dispatcher.include(request, response);
			
		}
		
	}

}
