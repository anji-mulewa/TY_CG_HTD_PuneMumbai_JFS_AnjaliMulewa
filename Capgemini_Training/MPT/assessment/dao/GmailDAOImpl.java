package com.capgemini.assessment.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

import com.capgemini.assessment.beans.AccountBeans;
import com.capgemini.assessment.beans.InboxBeans;

public class GmailDAOImpl implements GmailDAO {
	FileReader reader;
	AccountBeans account;
	InboxBeans inbox;
	Properties prop = null;

	public GmailDAOImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean login(String email, String password) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query"))) {
			pstmt.setString(1, email);
			pstmt.setString(2, password);

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return true;
				} else {
					return false;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void compose(int userid, String message) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query5"))) {
			pstmt.setInt(1, userid);
			pstmt.setString(2, message);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				System.out.println("Message composed");
			} else {
				System.out.println("Message not composed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean create(int userid, String username, String password, String email) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query2"))) {
			pstmt.setInt(1, userid);
			pstmt.setString(2, username);
			pstmt.setString(3, password);
			pstmt.setString(4, email);

			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<InboxBeans> show(int userid) {
		ArrayList<InboxBeans> messages = new ArrayList<InboxBeans>();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query3"))) {
			pstmt.setInt(1, userid);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					inbox.setMessageid(rs.getInt(1));
					inbox.setUserid(rs.getInt(2));
					inbox.setMessage(rs.getString(3));
					messages.add(inbox);
					System.out.println(messages);
				}
				return messages;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return messages;

	}

	@Override
	public int getUserId(String email) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("user"),
				prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query4"))) {

			pstmt.setString(1, email);
			ResultSet rs = pstmt.executeQuery();
			int i = rs.getInt(1);
			return i;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}