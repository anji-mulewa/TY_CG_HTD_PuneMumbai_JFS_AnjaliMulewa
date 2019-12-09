package com.capgemini.exception.first;

public class OutOfBoundExample {
	public static void main(String[] args) {
		System.out.println("Main started");
		int a[] = new int[3];
		String s= null;
		try {
			System.out.println(s.toUpperCase());
			System.out.println(a[9]);
			System.out.println(10/0);
		}
		catch (ArrayIndexOutOfBoundsException b) {
			System.out.println("Don't cross array boundary");
		}
		catch(ArithmeticException e) {
			System.out.println("don't divide by zero");
		}
		catch(NullPointerException e) {
			System.out.println("dont deal with null");
		}
	catch(Exception e) {
		System.out.println("sorry something went wrong");
	}
		System.out.println("main ended");
	}
}
