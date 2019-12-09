package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCRetrival {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		
		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded....");
			
			// get db connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=root&password=root";
			conn =DriverManager.getConnection(dbUrl); // getConnection is static method and returns a refernce of Connection
			System.out.println("Connection established");

			// Issue SQL Query
			String query ="SELECT * FROM users_info WHERE userid=?";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter the user id ");
			pstmt.setInt(1, sc.nextInt());
			rs = pstmt.executeQuery();
			
			//process the results
			if(rs.next()) {
				System.out.println("user id: "+rs.getInt(1));
				System.out.println("User name: "+rs.getString(2));
				System.out.println("user email: "+rs.getString(3));
				System.out.println("Password: "+rs.getString(4));
			} else {
				System.out.println("something went wrong");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
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
			sc.close();
			
		}
	}



	}


