package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDeleteUser {
public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	Scanner sc = new Scanner(System.in);
	try {
		//load the driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded.....");
		System.out.println("------------------");
		//get db connection via driver
		String dburl ="jdbc:mysql://localhost:3306/capg_db?user=root&password=root";
		conn = DriverManager.getConnection(dburl);
		System.out.println("Connection established....");
		System.out.println("-------------------");
		//issue a query
		String query = "delete from users_info where userid =?";
		pstmt=conn.prepareStatement(query);
		System.out.println("Enter userid that is to be deleted....");
		pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
		int count = pstmt.executeUpdate();
		if(count>0) {
			System.out.println("Data deleted....");
		}
	}
	catch(Exception e) {
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
	if(pstmt!=null) {
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
