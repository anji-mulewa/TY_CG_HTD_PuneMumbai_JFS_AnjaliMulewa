package com.capgemini.exception.custom;

public class InvalidLimitException extends Exception{
private String message = "Day limit is 40000";
@Override
	public String getMessage() {
		return message;
	}
}
