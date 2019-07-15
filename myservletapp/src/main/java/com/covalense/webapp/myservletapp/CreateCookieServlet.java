package com.covalense.webapp.myservletapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createcookie")
public class CreateCookieServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// create cookie
		Cookie myNameCookie = new Cookie("myName", "jyothi");
		Cookie myCompanyCookie = new Cookie("myCompany", "covalense");
		myCompanyCookie.setMaxAge(7*24*60*60);//non persistence

		// send the above cookie to browser
		response.addCookie(myNameCookie);
		response.addCookie(myCompanyCookie);

		PrintWriter out = response.getWriter();
		out.print("created the cookie ! ! !");
		out.print("created the 2nd cookie ! ! !");
	}// End of doGet()

}// End of class
