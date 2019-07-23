package com.covalense.webapp.myservletapp;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.webapp.bean.EmployeeInfo;
import com.covalense.webapp.dao.EmployeeDAO;
import com.covalense.webapp.dao.EmployeeDAOFactory;

@WebServlet(urlPatterns = "/search", initParams = { @WebInitParam(name = "actress", value = "ishwarya") })

//@WebServlet("/search/employeesearch")
public class EmployeeSearchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//ServletContext ctx = getServletContext();
		ServletContext context=getServletContext();
		//String movieName = ctx.getInitParameter("movie");
		String movieName = context.getInitParameter("movie");

		ServletConfig config = getServletConfig();
		String actorname = config.getInitParameter("movie");
		String actorsname = config.getInitParameter("actress");

		String idValue = req.getParameter("id");

		EmployeeDAO dao = EmployeeDAOFactory.getinstance();
		EmployeeInfo bean = dao.getEmployeeInfo(idValue);
		PrintWriter out = resp.getWriter();

		if (bean == null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:red\"> Employee Not Found</span></H1>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
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
			out.print("<BR> movie IS :" + movieName);
			out.print("<BR> actorname IS :" + actorname);
			out.print("</BODY>");
			out.print("</HTML>");

		}

		// get the obj from forwrd servlet
		//EmployeeInfo employeeInfo = (EmployeeInfo) req.getAttribute("info");
		EmployeeInfo employeeInfo = (EmployeeInfo) context.getAttribute("info");
		if (employeeInfo == null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:red\"> EmployeeBean object Not Found</span></H1>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:green\"> EmployeeBean object Found</span></H1>");
			out.print("<BR>");
			out.print(" <BR> NAME IS :" + employeeInfo.getNAME());
			out.print(" <BR> AGE IS :" + employeeInfo.getAGE());
			out.print("<BR> ID IS :"+employeeInfo.getID());
			out.print("</BODY>");
			out.print("</HTML>");

		}

	}

}// End of class
