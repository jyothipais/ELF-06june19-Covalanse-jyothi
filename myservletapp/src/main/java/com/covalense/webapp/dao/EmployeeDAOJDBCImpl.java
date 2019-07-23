package com.covalense.webapp.dao;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.covalense.webapp.bean.EmployeeInfo;

import lombok.extern.java.Log;


@Log
public class EmployeeDAOJDBCImpl implements EmployeeDAO {

	public ArrayList<EmployeeInfo> getAllEmployeeInfo() {

		String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
		String query = "select * from employee_info";
		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root1234");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			ArrayList<EmployeeInfo> beans = new ArrayList<>();
			while (rs.next()) {
				EmployeeInfo bean = new EmployeeInfo();
				bean.setID(rs.getInt("ID"));
				bean.setNAME(rs.getString("NAME"));
				bean.setAGE(rs.getInt("AGE"));
				bean.setGENDER(rs.getString("GENDER"));
				bean.setSALARY(rs.getDouble("SALARY"));
				bean.setPHONE(rs.getInt("PHONE"));
				bean.setJOINING_DATE(rs.getDate("JOINING_DATE"));
				bean.setACCOUNT_NUMBER(rs.getInt("ACCOUNT_NUMBER"));
				bean.setEMAIL(rs.getString("EMAIL"));
				bean.setDESIGNATION(rs.getString("DESIGNATION"));
				bean.setDOB(rs.getDate("DOB"));
				bean.setDEPT_ID(rs.getInt("DEPT_ID"));
				bean.setMNGR_ID(rs.getInt("MNGR_ID"));

			}
			return beans;

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} // End of try-catch
		return null;
	}// End of class

	public EmployeeInfo getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}// end of getEmployeeInfo(String id)

	public EmployeeInfo getEmployeeInfo(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dbUrl, "root", "root1234");
			log.info("connection impl class ===========>" + con.getClass());
			String query = "select * from employee_info  where id=? ";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			EmployeeInfo bean = new EmployeeInfo();
			while (rs.next()) {
				bean.setID(rs.getInt("ID"));
				bean.setNAME(rs.getString("NAME"));
				bean.setAGE(rs.getInt("AGE"));
				bean.setGENDER(rs.getString("GENDER"));
				bean.setSALARY(rs.getDouble("SALARY"));
				bean.setPHONE(rs.getInt("PHONE"));
				bean.setJOINING_DATE(rs.getDate("JOINING_DATE"));
				bean.setACCOUNT_NUMBER(rs.getInt("ACCOUNT_NUMBER"));
				bean.setEMAIL(rs.getString("EMAIL"));
				bean.setDESIGNATION(rs.getString("DESIGNATION"));
				bean.setDOB(rs.getDate("DOB"));
				bean.setDEPT_ID(rs.getInt("DEPT_ID"));
				bean.setMNGR_ID(rs.getInt("MNGR_ID"));

			}
			return bean;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} // end of getEmployeeInfo(int id)

	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfo bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfo bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}
