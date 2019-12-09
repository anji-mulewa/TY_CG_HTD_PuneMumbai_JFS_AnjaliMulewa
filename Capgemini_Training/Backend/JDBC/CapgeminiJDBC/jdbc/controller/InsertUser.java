package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemin.jdbc.factory.UserFactory;
import com.capgemini.jdbc.dao.UserDAO;

public class InsertUser {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	UserDAO dao = UserFactory.getInstance();
	System.out.println("Enter userid");
	int i = sc.nextInt();
	System.out.println("Enter user name");
	String n = sc.next();
	System.out.println("Enter email");
	String e = sc.next();
	System.out.println("Enter password");
	String p = sc.next();
	
	boolean b = dao.insertInfo(i, n, e, p);
	if(b) {
		System.out.println("User info inserted...");
		System.out.println("Userid :"+i+ " Username :"+n+ " email :"+e);
	}else {
		System.out.println("User info not inserted something went wrong");
	}
	sc.close();
}
}
