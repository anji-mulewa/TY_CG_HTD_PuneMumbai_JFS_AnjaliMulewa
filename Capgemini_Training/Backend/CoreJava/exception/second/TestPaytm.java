package com.capgemini.exception.second;

public class TestPaytm {
public static void main(String[] args) {
	System.out.println("Main-started");
	Paytm p = new Paytm();
try {
	p.book();
}catch(ArithmeticException a) {
	System.out.println("Exception handled in main");
}
	System.out.println("Main-ended");
}
}
