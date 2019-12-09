package com.capgemini.assessment.controller;

import java.util.Scanner;

import com.capgemini.assessment.dao.GmailDAO;
import com.capgemini.assessment.factroy.GmailFactory;

public class Create {
private static Scanner s;

public static boolean createAccount() {
	GmailDAO dao = GmailFactory.getInstance();
	s = new Scanner(System.in);
	System.out.println("Enter user-id");
	int userid= s.nextInt();
	System.out.println("Enter username");
	String username=s.next();
	System.out.println("Enter password");
	String password= s.next();
	System.out.println("Enter email");
	String email= s.next();
	boolean res= dao.create(userid, username, password, email);
	return res;
}//end of login method

}//end of Login class
