package com.covalense.webapp.myservletapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.webapp.bean.EmployeeInfo;
import com.covalense.webapp.dao.EmployeeDAO;
import com.covalense.webapp.dao.EmployeeDAOFactory;

@WebServlet("/search")
public class EmployeeSearchServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
		String idValue= req.getParameter("id");
		
		EmployeeDAO dao=EmployeeDAOFactory.getinstance();
		EmployeeInfo bean=dao.getEmployeeInfo(idValue);
		PrintWriter out=resp.getWriter();
		
		if(bean==null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:red\"> Employee Not Found</span></H1>");
			out.print("</BODY>");
			out.print("</HTML>");
		}else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:green\"> Employee Found</span></H1>");
			out.print("<BR>");
			out.print(" <BR> NAME IS :" + bean.getNAME());
			out.print(" <BR> AGE IS :" + bean.getAGE());
			out.print(" <BR> DATE OF BIRTH IS :" + bean.getDOB());
			out.print(" <BR> GENDER IS :" + bean.getGENDER());
			out.print(" <BR> MAIL ID IS :" + bean.getEMAIL());
			out.print(" <BR> MANAGER ID IS :" + bean.getMNGR_ID());
			out.print(" <BR> DESIGNATION IS :" + bean.getDESIGNATION());
			out.print("</BODY>");
			out.print("</HTML>");
			
		}
		
	}

	
}//End of class
