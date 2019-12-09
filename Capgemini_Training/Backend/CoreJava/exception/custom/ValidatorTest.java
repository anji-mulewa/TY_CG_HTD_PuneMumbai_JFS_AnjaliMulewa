package com.capgemini.exception.custom;

public class ValidatorTest {
public static void main(String[] args) {
	Validator v = new Validator();
	try {//not necessary to use try catch block it is used 
		 //just to avoid abnormal termination of program
		v.verify(17);
		System.out.println("Welcome to pub");
	}
	catch(InvalidAgeException in) {
		System.out.println(in.getMessage());
		System.err.println(in.getMessage()); //err is used to print the error msg in red color
	}
}
}
