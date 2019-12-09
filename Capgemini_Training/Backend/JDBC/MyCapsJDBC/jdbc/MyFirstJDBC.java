package com.capgemini.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class MyFirstJDBC {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// load the driver
			java.sql.Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Loaded......");
			System.out.println("----------------------------");

			// Get DB connection via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl); // getConnection is static method and returns a 
												//reference of Connection interface
			
			System.out.println("Connection established.....");
			System.out.println("----------------------------");

			// Issue SQL Query via Connection
			String query = "SELECT * FROM users_info";  
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			// process the results returned by SQL query
			while (rs.next()) {
				System.out.println("User Id " + rs.getInt("userid"));
				System.out.println("User name " + rs.getString("username"));
				System.out.println("Email-id "+rs.getString("email"));
				System.out.println("Password "+rs.getString("password"));
				System.out.println("---------------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
