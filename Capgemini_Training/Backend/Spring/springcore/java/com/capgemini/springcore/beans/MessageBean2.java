package com.capgemini.springcore.beans;

public class MessageBean2 {

	private String message;

	public MessageBean2() {
		System.out.println("Object creation");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Init phase");
	}
	
	public void destroy() {
		System.out.println("Destroy phase");
	}
	
}
