package com.capgemini.arraylist;

import java.util.Scanner;

public class MyStudentAppTest {
public static void main(String[] args) {
	MyStudentApp m = new MyStudentApp();
	Scanner s = new Scanner(System.in);
	while(true) {
		System.out.println("Enter option");
		int opt = s.nextInt();
		
		switch(opt) {
		case 1: System.out.println("Add student data");
		m.add();
		break;
		case 2:System.out.println("Display data");
		m.display();
		break;
		case 3:System.exit(0);
		break;
		default: System.out.println("Wrong option");
		}
	}
}
}
