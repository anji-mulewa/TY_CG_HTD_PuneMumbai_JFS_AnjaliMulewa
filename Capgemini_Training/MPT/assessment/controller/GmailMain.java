package com.capgemini.assessment.controller;

import java.util.Scanner;


public class GmailMain {
	public static void main(String[] args) {
		start();
	}// end of main method

	public static void start() {
		Scanner s = new Scanner(System.in);
		boolean b = true;
		while (b) {
			System.out.println("i.Press 1 to login \n ii.Press 2 to register");
			int option = s.nextInt();
			switch (option) {
			case 1:Login.loginMethod();
				break;
			case 2:
				if (Create.createAccount()) {
					System.out.println("Account created");
				} else {
					System.out.println("Account not created");
				}
				break;
			default:
				System.out.println("Enter correct option");
			}
			System.out.println("Do you want to continue? \n press 1 to continue \n press 0 to exit");
			int input = s.nextInt();
			if (input == 1) {
				start();
			} else {
				System.exit(0);
			}

		}
		s.close();
	}

}// end of main program
