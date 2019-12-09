package com.capgemini.exception.custom;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in);
				Scanner s1 = new Scanner(System.in);
				Scanner s2 = new Scanner(System.in)) {
			System.out.println("Enter age ");
			int age = s.nextInt();
			System.out.println("Age is " + age);
		}

	}
}
