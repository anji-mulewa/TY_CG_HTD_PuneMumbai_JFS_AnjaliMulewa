package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.annotations.beans.MessageBean;
import com.capgemini.springcore.annotations.config.MessageConfig;

public class MessageTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);

		MessageBean mb =context.getBean(MessageBean.class);
		System.out.println("Message 1 = "+mb.getMessage());
	
		MessageBean mb1 =context.getBean(MessageBean.class);
		mb1.setMessage("Hello!");
		System.out.println("Message 2 = "+mb1.getMessage());
	
		System.out.println("Message 1 = "+mb.getMessage());
		
	}

}
