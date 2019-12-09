package com.capgemini.assessment.controller;

import java.util.Scanner;

import com.capgemini.assessment.beans.AccountBeans;
import com.capgemini.assessment.dao.GmailDAO;
import com.capgemini.assessment.factroy.GmailFactory;

public class Login {
public static void loginMethod() {
	GmailDAO dao = GmailFactory.getInstance();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter email-id");
	String email = s.next();
	System.out.println("Enter password");
	String password = s.next();
	boolean res= dao.login(email, password);
	System.out.println(res);
	//System.out.println(al2);
	if (res) {
		System.out.println("i.Press A to compose \n ii.Press B to show inbox");
		char choice = s.next().charAt(0);
		switch (choice) {
		case 'A':
//			System.out.println("Enter email to send the mail");
//			int userid1 = al.getUserid();
//			System.out.println("Enter message");
//			String message = s.next();
//			dao.compose(userid1, message);

			break;
		case 'B':
			/*
			 * int userid=dao.getUserId(email); dao.show(userid);
			 */ break;
		default:
			System.out.println("Enter correct choice");
		}// end of switch
	} else {
		System.out.println("Something went wrong...");

	} // end of case 1

}
}
