package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class AppTryWithResources {
	public static void main(String[] args) {

		String query = "select * from employee_info";
		String dbUrl = "jdbc:mysql://awsdb.cxzorliez4wd.ap-south-1.rds.amazonaws.com:3306/awsdb";

		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root1234");) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			Class.forName("com.mysql.jdbc.Driver").newInstance();

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
		} // End of try-catch
	}// End of class
}// End of main
