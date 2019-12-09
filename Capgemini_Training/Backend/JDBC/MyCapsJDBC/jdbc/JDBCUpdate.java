package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCUpdate {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			System.out.println("-----------------");

//Get db connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db";

			//String dburl = "jdbc:mysql://localhost:3306/capg_db";
			System.out.println("Enter the username and password");
			String user = sc.nextLine();
			String password = sc.nextLine();
			conn = DriverManager.getConnection(dbUrl, user, password);

			/*
			 * conn = DriverManager.getConnection(dbUrl);
			 * System.out.println("connection established...");
			 * System.out.println("----------------------");
			 */
//
			String query = "Update users_info set password=? where userid=?";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter userid..");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("update password..");
			pstmt.setString(1, sc.nextLine()); // 1 is used as parameter index because it is the first parameter
			int count = pstmt.executeUpdate();
			if (count > 0) {
				System.out.println("Data Updated....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		sc.close();
	}

}
