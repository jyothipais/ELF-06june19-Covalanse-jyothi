package com.covalense.jdbcapp;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class StatementExampleB {
	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dbUrl, "root", "root1234");

			log.info("connection impl class ===========>" + con.getClass());

			String query = "select * from employee_info"
					+ " where id=1 ";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				log.info("ID--------------->" + rs.getInt("ID"));
				log.info("NAME------------->" + rs.getString("NAME"));
				log.info("AGE-------------->" + rs.getInt("AGE"));
				log.info("GENDER----------->" + rs.getString("GENDER"));
				log.info("SALARY----------->" + rs.getDouble("SALARY"));
				log.info("PHONE------------>" + rs.getInt("PHONE"));
				log.info("JOINING_DATE----->" + rs.getDate("JOINING_DATE"));
				log.info("ACCOUNT_NUMBER--->" + rs.getInt("ACCOUNT_NUMBER"));
				log.info("EMAIL------------>" + rs.getString("EMAIL"));
				log.info("DESIGNATION------>" + rs.getString("DESIGNATION"));
				log.info("DOB-------------->" + rs.getDate("DOB"));
				log.info("DEPT_ID---------->" + rs.getInt("DEPT_ID"));
				log.info("MNGR_ID----------> " + rs.getInt("MNGR_ID"));

			}

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
