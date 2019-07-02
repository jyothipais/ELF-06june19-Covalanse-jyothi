package com.covalense.jdbcapp;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class StatementExampleA {
	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		int rs;
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dbUrl, "root", "root1234");

			log.info("connection impl class ===========>" + con.getClass());

			String query = "insert into employee_info values(22,'amali','female',21,12.800,12232334,'2019-03-04',23232323,'amali@gmail.com','networking','1998-04-06',2,75) ";
			stmt = con.createStatement();
			rs = stmt.executeUpdate(query);
			log.info("" + rs);

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
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
