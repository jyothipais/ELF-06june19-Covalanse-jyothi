package com.covalense.emp.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.emp.bean.EmployeeInfo;
import com.covalense.emp.bean.EmployeeOtherInfo;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		
		EmployeeInfo bean=new EmployeeInfo();
		SimpleDateFormat date=new SimpleDateFormat("yyyy-mm-dd");
		try {
		bean.setID(Integer.parseInt(request.getParameter("ID")));
		bean.setNAME(request.getParameter("NAME"));
		bean.setAGE(Integer.parseInt(request.getParameter("AGE")));
		//bean.setACCOUNT_NUMBER(Integer.parseInt(request.getParameter("ACCOUNT_NUMBER")));
		bean.setDEPT_ID(Integer.parseInt(request.getParameter("DEPT_ID")));
		bean.setMNGR_ID(Integer.parseInt(request.getParameter("MNGR_ID")));
		bean.setPHONE(Integer.parseInt(request.getParameter("PHONE_NUMBER")));
		bean.setDESIGNATION(request.getParameter("DESIGNATION"));
		bean.setEMAIL(request.getParameter("EMAIL"));
		bean.setGENDER(request.getParameter("GENDER"));
		bean.setSALARY(Double.parseDouble(request.getParameter("SALARY")));
		bean.setJOINING_DATE(date.parse(request.getParameter("JOINING_DATE")));		
		bean.setDOB(date.parse(request.getParameter("DOB")));
		} catch (ParseException e) {			
			e.printStackTrace();
		}	
		EmployeeOtherInfo otherInfo = new EmployeeOtherInfo();
		otherInfo.setID(Integer.parseInt(request.getParameter("ID")));
		otherInfo.setNATIONALITY((request.getParameter("NATIONALITY")));
		otherInfo.setRELIGION((request.getParameter("RELIGION")));
		//otherInfo.setIS_MARRIED(Integer.parseInt(request.getParameter("IS_MARRIED")));
		otherInfo.setBLOOD_GROUP((request.getParameter("BLOOD_GROUP")));
		//otherInfo.set_challenged((request.getParameter("is_challenged")));
		otherInfo.setEMERGENCY_CONTACT_PERSON((request.getParameter("EMERGENCY_CONTACT_PERSON")));
		otherInfo.setEMERGENCY_CONTACT_NUMBER(Integer.parseInt(request.getParameter("EMERGENCY_CONTACT_NUMBER")));
		otherInfo.setPAN(Integer.parseInt(request.getParameter("PAN")));
		otherInfo.setFATHER_NAME((request.getParameter("FATHER_NAME")));
		otherInfo.setMOTHER_NAME((request.getParameter("MOTHER_NAME")));
		otherInfo.setSPOUSE_NAME((request.getParameter("SPOUSE_NAME")));
		otherInfo.setPASSPORT((request.getParameter("PASSPORT")));
		otherInfo.setADHAR(Integer.parseInt(request.getParameter("ADHAR")));
		
		
		EmployeeDAO dao=EmployeeDAOFactory.getinstance();
		boolean result=dao.createEmployeeInfo(bean);
		
		PrintWriter out=response.getWriter();
		if(result) {
			RequestDispatcher dispatcher = null;
			  response.setContentType("text/html");
			  dispatcher = request.getRequestDispatcher("collapse.jsp?MSG=Registration success");
			  dispatcher.include(request, response);
		}else {
			RequestDispatcher dispatcher = null;
			  response.setContentType("text/html");
			  dispatcher = request.getRequestDispatcher("collapse.jsp?MSG=Registration Failed");
			  dispatcher.include(request, response);
		}
		
	}

}
