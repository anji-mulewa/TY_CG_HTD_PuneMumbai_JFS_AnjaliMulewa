package com.capgemini.exception.first;

public class Pen {
public static void main(String[] args) {
	System.out.println("Main started");
	int i=0;
	try {
		System.out.println("hi");
		System.out.println(10/i);
		System.out.println("Keep smiling");
	}
	catch (ArithmeticException a) {
System.out.println("Don't divide by zero");
	}
	System.out.println("Main ended");
}
}
