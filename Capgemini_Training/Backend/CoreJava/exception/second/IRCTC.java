package com.capgemini.exception.second;

public class IRCTC {
void confirm() {
	System.out.println("Confirm started");
	try {
	System.out.println(10/0);
	}
	catch(ArithmeticException e) {
		System.out.println("Exception handled in IRCTC");
	}
	System.out.println("Confirm Ended");
}
}
