 package com.covalense.webapp.myservletapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.webapp.bean.EmployeeInfo;
import com.covalense.webapp.dao.EmployeeDAO;
import com.covalense.webapp.dao.EmployeeDAOFactory;

@WebServlet("/create")
public class CreateEmployeeInfoServlet extends HttpServlet {
	@Override

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeInfo bean=new EmployeeInfo();
		SimpleDateFormat date=new SimpleDateFormat("yyyy-mm-dd");
		try {
		bean.setID(Integer.parseInt(req.getParameter("ID")));
		bean.setNAME(req.getParameter("NAME"));
		bean.setAGE(Integer.parseInt(req.getParameter("AGE")));
		bean.setACCOUNT_NUMBER(Integer.parseInt(req.getParameter("ACCOUNT_NUMBER")));
		bean.setDEPT_ID(Integer.parseInt(req.getParameter("DEPT_ID")));
		bean.setMNGR_ID(Integer.parseInt(req.getParameter("MNGR_ID")));
		bean.setPHONE(Integer.parseInt(req.getParameter("PHONE_NUMBER")));
		bean.setDESIGNATION(req.getParameter("DESIGNATION"));
		bean.setEMAIL(req.getParameter("EMAIL"));
		bean.setGENDER(req.getParameter("GENDER"));
		bean.setSALARY(Double.parseDouble(req.getParameter("SALARY")));
		bean.setJOINING_DATE(date.parse(req.getParameter("JOINING_DATE")));		
		bean.setDOB(date.parse(req.getParameter("DOB")));
		} catch (ParseException e) {			
			e.printStackTrace();
		}		
		EmployeeDAO dao=EmployeeDAOFactory.getinstance();
		boolean result=dao.createEmployeeInfo(bean);
		
		PrintWriter out=resp.getWriter();
		if(result) {
			out.append("Employee Inserted");
		}else {
			out.print("Employee Not Inserted");
		}
	}

}// End of class
