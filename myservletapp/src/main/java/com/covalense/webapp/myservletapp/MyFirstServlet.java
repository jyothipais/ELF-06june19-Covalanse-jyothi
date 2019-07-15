package com.covalense.webapp.myservletapp;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.java.Log;

@Log
public  class MyFirstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext ctx=getServletContext();
		String movieName=ctx.getInitParameter("movie");
		
		ServletConfig config=getServletConfig();
		String actorname= config.getInitParameter("movie");
		
		String currentDateTime=new Date().toString();
		
		
		/*
		 * String htmlResponse = "<!DOCTYPE html>" + "<html>" + "<head>" +
		 * "<meta charset=\"ISO-8859-1\">" + "<title>My First HTML</title>" + "</head>"
		 * + "<body>" + "<h1>  Current date & time is :" + "<br>" +
		 * "<span style =\"color : red\">  09th July 2019 5:22 PM IST</span> " + "</h1>"
		 * + "</body>" + "</html>"; resp.setContentType("text/html");
		 * resp.setHeader("Refresh","1"); PrintWriter out = resp.getWriter();
		 * out.print(htmlResponse);
		 */

		String httpMethod = req.getMethod();
		String protocol = req.getProtocol();
		String requesturl = req.getRequestURL().toString();

		log.info("" + httpMethod);
		log.info("" + protocol);
		log.info("" + requesturl);

		// Get Query String Information
		String fnameValue = req.getParameter("fname");
		String lnameValue = req.getParameter("lname");

		String htmlResponse = "<!DOCTYPE html>" + "<html>" + "<head>" + "<meta charset=\"ISO-8859-1\">"
				+ "<title>My First HTML</title>" + "</head>" + "<body>" + "<h1>  Current date & time is :" + "<br><br>"
				+ "<span style =\"color : red\">  09th July 2019 5:22 PM IST</span> " + "<br><br>" + "First Name:"
				+ fnameValue + "<br><br>" + "Last Name:" + lnameValue +"movie Name:" +movieName+"actor name"+actorname+"</h1>" + "</body>" + "</html>";

		// send the above htmlresponse to browser.
		resp.setContentType("text/html");	

		// resp.setHeader("Refresh","1");
		PrintWriter out = resp.getWriter();
		out.print(htmlResponse);
	}

}
