package com.covalense.jdbcapp;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class InsertIntoAWSDB {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		int rs ;
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dbUrl = "jdbc:mysql://awsdb.cxzorliez4wd.ap-south-1.rds.amazonaws.com:3306/awsdb";
			con = DriverManager.getConnection(dbUrl, "root", "root1234");

			log.info("connection impl class ===========>" + con.getClass());

			String query = "insert into employee_info values(?,?,?,?,?,"
					+ "?,?,?,?,"
					+ "?,?,?,?) ";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, (args[1]));
			pstmt.setString(3, (args[2]));
			pstmt.setInt(4, Integer.parseInt(args[3]));
			pstmt.setDouble(5, Double.parseDouble(args[4]));
			pstmt.setInt(6, Integer.parseInt(args[5]));
			pstmt.setString(7, (args[6]));
			pstmt.setInt(8, Integer.parseInt(args[7]));
			pstmt.setString(9, (args[8]));
			pstmt.setString(10, (args[9]));
			pstmt.setString(11, (args[10]));
			pstmt.setInt(12, Integer.parseInt(args[11]));
			pstmt.setInt(13, Integer.parseInt(args[12]));
			
			rs = pstmt.executeUpdate();
		

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
