package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotations.beans.Car;

public class CarTest {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("carConfig.xml");
	Car myCar = context.getBean("myCar" , Car.class);
	
	System.out.println("model name = "+myCar.getModelName());
	System.out.println("model number= "+myCar.getModelNum());
	System.out.println("CC is = "+myCar.getEngine().getCC());
	System.out.println("Type is = "+myCar.getEngine().getType());
}//end of main
}//end of class
