package com.capgemini.exception.custom;

public class InvalidAgeException extends RuntimeException {
	/*
	 * the code below this is just used for printing a custom message overriding the
	 * getMessage method is not necessary
	 */
	private String msg = "Invalid age to proceed";
	// override any one of the method not necessary to override both
	public InvalidAgeException(String msg) {
this.msg = msg; // to print any other message
	}
	public InvalidAgeException() {
	}
	@Override
	public String getMessage() {
		return msg;
	}
	@Override
	public String toString() {
		return msg;
	}

}
