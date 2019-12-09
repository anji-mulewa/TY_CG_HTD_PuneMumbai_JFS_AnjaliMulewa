package com.capgemini.exception.custom;

public class Validator { //it is used only to throw an exception 
						 //it depends on us to handle the exception or not
void verify(int age) {

	if(age<18) {
			/*
			 * InvalidAgeException inv = new InvalidAgeException(); throw inv;
			 */
	throw new InvalidAgeException();  
	
	}
}
}
