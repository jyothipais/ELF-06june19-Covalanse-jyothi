package com.covalense.employeeapp.servletapp;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebServlet("/loginpage")
public class Loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie dummyCookie = new Cookie("dummyCookie", "CheckCookiesEnabled");
		response.addCookie(dummyCookie);

		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(false);

		if (session == null) {

			RequestDispatcher dispatcher = request.getRequestDispatcher("employeeinfo.html");
			dispatcher.include(request, response);
		} else {
			out.print("<h1><span> Invalid session</span></h1>");
			out.print("<BR><BR>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
			dispatcher.forward(request, response);

		}

	}

}
