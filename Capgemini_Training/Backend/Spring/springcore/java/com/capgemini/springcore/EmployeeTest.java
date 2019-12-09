package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeBean employeeBean = (EmployeeBean) context.getBean("employee");
		EmployeeBean employeeBean2 = context.getBean("employee1" , EmployeeBean.class);
		
		
		System.out.println("Employee ID :" +employeeBean.getEmpId());
		System.out.println("Employee Name: " +employeeBean.getEmpName());

		System.out.println("Employee ID :" +employeeBean2.getEmpId());
		System.out.println("Employee Name: " +employeeBean2.getEmpName());

	}

}
