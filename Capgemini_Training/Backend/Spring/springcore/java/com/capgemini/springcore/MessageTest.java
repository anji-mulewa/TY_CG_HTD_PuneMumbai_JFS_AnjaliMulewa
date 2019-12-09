package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBean;

public class MessageTest {

	public static void main(String[] args) {
		/*
		 * MessageBean messageBean = new MessageBean();
		 * messageBean.setMessage("Hello World!!");
		 * 
		 * System.out.println(messageBean.getMessage());
		 * 
		 */
	
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
	//	((AbstractApplicationContext)context).registerShutdownHook(); // this can be anywhere
		
		MessageBean messageBean = (MessageBean) context.getBean("messageBean");
		System.out.println(messageBean.getMessage());
		
		((AbstractApplicationContext)context).close(); // this should be only at the end
	}//end of main()

}//end of class
