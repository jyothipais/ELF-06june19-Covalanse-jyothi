package com.covalense.employeeapp.servletapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.employeeapp.DAO.EmployeeDAO;
import com.covalense.employeeapp.DAO.EmployeeDAOFactory;
import com.covalense.employeeapp.bean.EmployeeInfo;


public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		
		if (session == null) {
			out.print("<h1><span style='coolor:red'>Please Login...Inavalid Credential you have provided!!!</h1>");
			out.print("<BR><BR>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
			dispatcher.include(request, response);
		}

		else {			
			String idValue = request.getParameter("search");	
			EmployeeDAO dao = EmployeeDAOFactory.getinstance();
			List<EmployeeInfo> bean = (List<EmployeeInfo>) dao.getEmployeeInfo(idValue);
			
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			out.print("<meta charset=\"ISO-8859-1\">");
			out.print("<title>Data</title>");
			out.print("<link rel=\"stylesheet");
			out.print("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css");
			out.print("	integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"");
			out.print("	crossorigin=\"anonymous\">");
			out.print("</head>");
			out.print("<body>");
			out.print("");
			out.print("	<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">");
			out.print("		<div class=\"btn-group\" role=\"group\" style=\"margin-left: 50px;\">");
			out.print("			<button type=\"button\" class=\"btn btn-default\">");
			out.print("				<img");
			out.print("					src=\"https://cdn.pixabay.com/photo/2019/07/14/00/07/flower-4335981__340.jpg\"");
			out.print("					alt=\"\" width=\"100px;\" height=\"100px;\">");
			out.print("			</button>");
			out.print("		</div>");
			out.print("		<div class=\"row\" style=\"margin-left: 15px;\" style=\"margin-left: 50px;\">");
			out.print("			<div class=\"col-lg-15\">");
			out.print("				<div class=\"input-group\">");
			out.print("					<span class=\"input-group-btn\">");
			out.print("						<button class=\"btn btn-default\" type=\"button\">Search</button>");
			out.print("					</span> <input type=\"text\" class=\"form-control\"");
			out.print("						placeholder=\"Search By ID or NAME \">");
			out.print("				</div>");
			out.print("			</div>");
			out.print("		</div>");
			out.print("		<div class=\"btn-group\" role=\"group\" aria-label=\"...\"");
			out.print("			style=\"margin-left: 900px;\">");
			out.print("			<button type=\"button\" class=\"btn btn-default\">Edit</button>");
			out.print("			<button type=\"button\" class=\"btn btn-default\">");
			out.print("				<a href=\"login.html\"> Lagout</a>");
			out.print("			</button>");
			out.print("");
			out.print("		</div>");
			out.print("");
			out.print("	</nav>");
			out.print("");
			out.print("<table>                      ");
			out.print("  <tr>                       ");
			out.print("    <td>Employee ID</td>     ");
			out.print("      <td>Employee Name</td> ");
			out.print("    </tr>                    ");
			for (EmployeeInfo empBean:bean) {

				out.print("  <tr>                       ");
				out.print("    <td>");
				out.print("<a href=\"getemployeeinfo.html" + + empBean.getID()+ ">");
				out.print("</td> ");
				out.print("<td>" + empBean.getNAME() + "</td> ");
				out.print("    </tr>                    ");
			}
			out.print("</table>						");
			out.print("	</div>");
			out.print("	<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"");
			out.print("		integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"");
			out.print("		crossorigin=\"anonymous\"></script>");
			out.print("	<script");
			out.print("		src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"");
			out.print("		integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"");
			out.print("		crossorigin=\"anonymous\"></script>");
			out.print("	<script");
			out.print("		src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"");
			out.print("		integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"");
			out.print("		crossorigin=\"anonymous\"></script>");
			out.print("");
			out.print("");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
