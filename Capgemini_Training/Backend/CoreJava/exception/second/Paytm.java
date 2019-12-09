package com.capgemini.exception.second;

public class Paytm {
void book() {
	System.out.println("Book started");
	IRCTC i= new IRCTC();

	try {
		i.confirm();	
	}catch(ArithmeticException a) {
		System.out.println("Exception handled in Paytm");
	}
	
	
	System.out.println("Book ended");
	
}
}
