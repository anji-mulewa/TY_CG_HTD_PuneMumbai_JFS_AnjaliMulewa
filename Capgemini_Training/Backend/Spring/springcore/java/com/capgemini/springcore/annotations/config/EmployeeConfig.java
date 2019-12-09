package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.capgemini.springcore.annotations.beans.EmployeeBean;

@Import(DepartmentConfig.class)
@Configuration
public class EmployeeConfig {
	@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean eb = new EmployeeBean();
		eb.setEmpId(101);
		eb.setEmpName("Sneha");
		return eb;
	}

}
