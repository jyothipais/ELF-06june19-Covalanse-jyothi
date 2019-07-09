package com.covalense.webapp.myservletapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String htmlResponse = "<!DOCTYPE html>" + "<html>" + "<head>" + "<meta charset=\"ISO-8859-1\">"
				+ "<title>My First HTML</title>" + "</head>" + "<body>" + "<h1>  Current date & time is :" + "<br>"
				+ "<span style =\"color : red\">  09th July 2019 5:22 PM IST</span> " + "</h1>" + "</body>" + "</html>";
		resp.setContentType("text/html");
		resp.setHeader("Refresh","1");
		PrintWriter out = resp.getWriter();
		out.print(htmlResponse);
	}

}
