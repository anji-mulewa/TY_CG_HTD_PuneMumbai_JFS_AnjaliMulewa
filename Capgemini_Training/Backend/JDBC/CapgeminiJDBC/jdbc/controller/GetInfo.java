package com.capgemini.jdbc.controller;

import java.util.Scanner;
import com.capgemin.jdbc.factory.UserFactory;
import com.capgemini.jdbc.beans.UserBean;
import com.capgemini.jdbc.dao.UserDAO;

public class GetInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDAO dao =UserFactory.getInstance();
		//UserBean user = dao.getInfo(2019002);
		//System.out.println("enter the user id");
		//UserBean user = dao.getInfo(sc.nextInt());

		System.out.println("enter user id ");
		int p = sc.nextInt();
		System.out.println("enter password"); 
		String i = sc.next();
		UserBean user2 = dao.login(p,i);
		if(user2!=null) { 
			System.out.println(user2); 
		}else {
			System.out.println("Something went wrong....."); 
		}
		sc.close();
	}
}

