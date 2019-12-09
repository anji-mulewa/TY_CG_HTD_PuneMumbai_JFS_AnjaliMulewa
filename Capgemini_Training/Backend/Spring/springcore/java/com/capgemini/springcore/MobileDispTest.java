package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MobileBean;

public class MobileDispTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("mobile.xml");
		MobileBean mobBean = context.getBean("mobile", MobileBean.class);

		System.out.println("Brand name  :" + mobBean.getBrandName());
		System.out.println("Model name  :" + mobBean.getModelName());
		System.out.println("Price       :" + mobBean.getPrice());
		System.out.println("Display Size:" + mobBean.getMobiledisp().getDisplaySize());
		System.out.println("Resolution  :" + mobBean.getMobiledisp().getResolution());
	}

}
