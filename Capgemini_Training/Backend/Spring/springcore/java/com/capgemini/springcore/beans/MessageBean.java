package com.capgemini.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean implements InitializingBean, DisposableBean {
	private String message;

	public MessageBean() {
		System.out.println("Object creation");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization phase!");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy phase");
	}
}// end of class
