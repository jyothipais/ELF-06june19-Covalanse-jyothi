package com.covalense.employeeapp.servletapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.employeeapp.DAO.EmployeeDAO;
import com.covalense.employeeapp.DAO.EmployeeDAOFactory;
import com.covalense.employeeapp.bean.EmployeeInfo;

public class fetchdetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		ServletContext context = getServletContext();
		ServletConfig config = getServletConfig();
		String idValue = getInitParameter("id");
		PrintWriter out1 = response.getWriter();
		if (session == null) {
			out.print("<h1><span style='coolor:red'>Please Login...Inavalid Credential you have provided!!!</h1>");
			out.print("<BR><BR>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
			dispatcher.include(request, response);
		}

		else {
			EmployeeDAO dao = EmployeeDAOFactory.getinstance();
			EmployeeInfo bean = dao.getEmployeeInfo(idValue);
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:green\"> EmployeeBean Details Found</span></H1>");
			out.print("<BR>");
			out.print("" + bean.getID());
			out.print("" + bean.getNAME());
			out.print("" + bean.getGENDER());
			out.print("" + bean.getAGE());
			out.print("" + bean.getSALARY());
			out.print("" + bean.getPHONE());
			out.print("" + bean.getJOINING_DATE());
			out.print("" + bean.getACCOUNT_NUMBER());
			out.print("" + bean.getEMAIL());
			out.print("" + bean.getDESIGNATION());
			out.print("" + bean.getDOB());
			out.print("" + bean.getDEPT_ID());
			out.print("" + bean.getMNGR_ID());
			out.print("</BODY>");
			out.print("</HTML>");
		}
	}

}
