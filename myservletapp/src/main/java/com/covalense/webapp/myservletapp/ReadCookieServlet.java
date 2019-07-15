package com.covalense.webapp.myservletapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readcookie")
public class ReadCookieServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	Cookie[] receivedCookies=	request.getCookies();
	PrintWriter out=response.getWriter();
	
	if(receivedCookies==null) {
		out.print("cookies are not present");
	}else {
		out.print("cookis are present");	
		for(Cookie rcvdCookie:receivedCookies) {
			out.print("Cookie Name :"+rcvdCookie.getName());
			out.print("Cookie Value :"+rcvdCookie.getValue());
			
		}
	}
	}// End of doGet()

}// End of class {
