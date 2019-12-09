package com.capgemini.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCRetrivialAll {

	public static void main(String[] args) {

		Connection conn = null;
		FileReader reader = null;
		Properties prop = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//load the driver it is not neccessary to load the driver in new versions
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded.....");
			
			//
			/*
			 * reader = new FileReader("C:\\Users\\ketan" + "\\Desktop\\db.properties");//if
			 * not present in project
			 */			
			reader =new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader); // reads the property lists 

		} catch (Exception e) {
			e.printStackTrace();
		} //make the file ready to read by java program

		try {
			//Get the connection
			String dbUrl =prop.getProperty("dbUrl");
			conn = DriverManager.getConnection(dbUrl,prop.getProperty("user"),prop.getProperty("password"));
			System.out.println("connection established...");
			System.out.println("-------------------------");
		
			//Issue a query
			String query ="Select * from users_info";
			stmt = conn.createStatement();
			rs =stmt.executeQuery(query);
		while(rs.next()) {
				System.out.println("id is "+rs.getInt(1));
 System.out.println("user name is "+rs.getString(2));
				System.out.println("Email-id is "+rs.getString(3));
				System.out.println("Password is "+rs.getString(4));
				System.out.println("--------------------------");
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
			if(rs!=null) {
				try {
					rs.close();
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
			
		}
		
		
	}

}
