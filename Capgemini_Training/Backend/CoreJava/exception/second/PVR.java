package com.capgemini.exception.second;

public class PVR {
	void confirm() {
		System.out.println("confirm started");
		try {
			System.out.println(10 / 0);
		} 
		catch (ArithmeticException a) {
			System.out.println("Exception handed in PVR");
			throw a;
		}
		finally {
			System.out.println("Confirm ended");
		}
	}
}
