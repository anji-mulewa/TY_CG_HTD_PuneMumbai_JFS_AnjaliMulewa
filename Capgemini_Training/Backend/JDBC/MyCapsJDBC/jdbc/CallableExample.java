package com.capgemini.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableExample {

	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			System.out.println("---------------");

			// get the connection
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db";
			System.out.println("Enter username and password");
			String user = sc.nextLine();
			String password = sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,user,password);
			System.out.println("Connection establised...");

			// Issue SQL query
			String query = "call getAllInfo()";
			cstmt = conn.prepareCall(query);
			boolean b = cstmt.execute();
			if (b == true) {
				rs = cstmt.getResultSet();
				while (rs.next()) {
					System.out.println("UserId: " + rs.getInt(1));
					System.out.println("User Name " + rs.getString(2));
					System.out.println("Email-id: " + rs.getString(3));
					System.out.println("Password: " + rs.getString(4));
					System.out.println("--------------------");
				}
			} else {
				int count = cstmt.getUpdateCount();
				if (count > 0) {
					System.out.println("Operatipon Successful......");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
finally {
	if(conn!=null) {
		try {
			conn.close();
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
	if(cstmt!=null) {
		try {
			cstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
		sc.close();
	}

}
