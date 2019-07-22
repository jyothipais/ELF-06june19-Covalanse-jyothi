package com.covalense.employeeapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import lombok.extern.java.Log;

@Log
public class LoginDAO {
	public static boolean validate(String employeename,String pass) {
		boolean status=false;
		Connection con = null;
		PreparedStatement pstmt = null;
	try {
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
	con = DriverManager.getConnection(dbUrl, "root", "root1234");
	pstmt = con.prepareStatement("select * from employee_info where employeename=? and password=?");
	pstmt.setString(1, employeename);
	pstmt.setString(2, pass);
	ResultSet resultSet=pstmt.executeQuery();
	status=resultSet.next();
	}catch(Exception e) {
		log.info(""+e);
	}
	return status;
	}

}
