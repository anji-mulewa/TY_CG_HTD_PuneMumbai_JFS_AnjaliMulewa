package com.capgemini.array.generic;

import java.util.Scanner;

public class ScannerTest {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter name ");
	String name = s.nextLine();
	
	System.out.println("enter age");
	int age = s.nextInt();
	
	System.out.println("enter height");
	double height=s.nextDouble();
	
	System.out.println("Name is "+name);
	System.out.println("age is "+age);
	System.out.println("height is "+height);
	s.close();
}
}
