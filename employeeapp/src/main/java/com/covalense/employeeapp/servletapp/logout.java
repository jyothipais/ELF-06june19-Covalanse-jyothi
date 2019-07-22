package com.covalense.employeeapp.servletapp;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// invalidate the session
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		PrintWriter out = ((ServletResponse) request).getWriter();
		
		out.print("<HTML>");
		out.print("<BODY>");
		out.print("<h1><span style='coolor:blue'>Thank You For Visiting</span></h1>");
		out.print("<BR><BR>");
		out.print("</BODY>");
		out.print("</HTML>");
		RequestDispatcher dispatcher = null;
		response.setContentType("text/html");
		dispatcher = request.getRequestDispatcher("employeeinfo.html");
		dispatcher.include(request, response);
	}

}
