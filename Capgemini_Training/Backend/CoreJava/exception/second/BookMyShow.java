package com.capgemini.exception.second;

public class BookMyShow {
	public static void main(String[] args) {
		System.out.println("main started");
		PVR p = new PVR();
		try {
			p.confirm();
		} 
		catch (ArithmeticException e) {
			System.out.println("Exception caught in main");
		}
		System.out.println("main-ended");
	}
}
