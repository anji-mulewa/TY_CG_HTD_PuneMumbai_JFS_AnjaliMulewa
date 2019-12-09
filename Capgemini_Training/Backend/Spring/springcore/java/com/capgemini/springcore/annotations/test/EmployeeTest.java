package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore.annotations.beans.EmployeeBean;
import com.capgemini.springcore.annotations.config.DepartmentConfig;
import com.capgemini.springcore.annotations.config.EmployeeConfig;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		((AbstractApplicationContext) context).registerShutdownHook();

		EmployeeBean eb = context.getBean(EmployeeBean.class);
		System.out.println("Employee Id    : " + eb.getEmpId());
		System.out.println("Employee Name  : " + eb.getEmpName());
		System.out.println("Department info-");
		System.out.println("Department Id  : " + eb.getDeptBean().getDeptId());
		System.out.println("Department Name: " + eb.getDeptBean().getDeptName());

		// ((AbstractApplicationContext) context).close();
	}
}
