package com.covalense.webapp.myservletapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("111111111111111111");

		out.print("<BR>");
		dispatcher = request.getRequestDispatcher("currentDate?fname=jyothi&lname=pais");
		dispatcher.include(request, response);
		out.print("<BR>");

		out.print("222222222222");

		out.print("<BR>");
		dispatcher = request.getRequestDispatcher("search?id=3");
		dispatcher.include(request, response);
		out.print("<BR>");

		out.print("33333333333");

		out.print("<BR>");
		dispatcher = request.getRequestDispatcher("Index.html");
		dispatcher.include(request, response);
		out.print("<BR>");

		out.print("4444444444444444444");

	}

}
