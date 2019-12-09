package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.jdbc.beans.UserBean;

public class UserDAOJDBCImpl implements UserDAO{
	Properties prop =null;
	UserBean user;
	FileReader reader = null;
	ArrayList<UserBean> list = new ArrayList<UserBean>();


	public UserDAOJDBCImpl() {
		try {
			//load the driver 
			Class.forName("com.mysql.jdbc.Driver");
			reader = new FileReader("db.properties");
			prop =new Properties();
			prop.load(reader);


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Override
	public UserBean getInfo(int userid) {

		//get the connection
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query2"))) {
			pstmt.setInt(1, userid);

			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					user = new UserBean();
					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));
				}
				return user;
			}
			catch (Exception e) {
				e.printStackTrace();
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}


		return null;
	}
	@Override
	public UserBean login(int userid, String password) {

		//get the connection
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query3"))) {
			pstmt.setInt(1, userid);
			pstmt.setString(2,password);

			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					user = new UserBean();
					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));
				}
				return user;
			}
			catch (Exception e) {
				e.printStackTrace();
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<UserBean> getAllInfo() {

		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query"))) {
			while(rs.next()) {
				user = new UserBean();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				list.add(user);
			}
			return list;

		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	@Override
	public boolean deleteInfo(int userid, String password) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query4"))){
			
			pstmt.setInt(1,userid);
			pstmt.setString(2, password);
			int count = pstmt.executeUpdate();
			if(count>0) {
				return true;
			}else {
				return false;
			}
		
		} catch (Exception e) {
			e.printStackTrace();

		}

		return false;
	}
	@Override
	public boolean insertInfo(int userid, String username, String emailid, String password) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("user"),prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query5"))) {
			pstmt.setInt(1,userid);
			pstmt.setString(2, username);
			pstmt.setString(3, emailid);
			pstmt.setString(4, password);
			int count = pstmt.executeUpdate();
			if(count>0) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}



}
