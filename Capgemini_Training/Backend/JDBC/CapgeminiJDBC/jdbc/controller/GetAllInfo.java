package com.capgemini.jdbc.controller;

import java.util.List;

import com.capgemin.jdbc.factory.UserFactory;
import com.capgemini.jdbc.beans.UserBean;
import com.capgemini.jdbc.dao.UserDAO;

public class GetAllInfo {
	public static void main(String[] args) {
		UserDAO dao = UserFactory.getInstance();
		List<UserBean> userList = dao.getAllInfo();
		if (userList != null) {
			for (UserBean user : userList) {
				System.out.println(user);
			}
		} else {
			System.out.println("something went wrong");
		}
	}
}
