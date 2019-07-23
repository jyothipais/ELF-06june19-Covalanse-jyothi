package com.covalense.webapp.myservletapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyRedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   @Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		//String url="http://www.gmail.com";
	  // String url="http://localhost:80/myservletapp/search?id=3";
	   String url="Index.html";
		response.sendRedirect(url);
	}

	
}
