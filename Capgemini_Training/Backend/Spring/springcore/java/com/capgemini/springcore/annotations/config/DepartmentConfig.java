package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.annotations.beans.DepartmentBean;

@Configuration
public class DepartmentConfig {

	@Bean(name = "dev")
	public DepartmentBean getDevDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(701);
		bean.setDeptName("Devloper");
		return bean;
	}

	@Bean(name = "test")
	public DepartmentBean getTestingDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptId(702);
		bean.setDeptName("Tester");
		return bean;
	}

	@Bean(name = "hr")
	// @Primary
	public DepartmentBean getHRDept() {
		DepartmentBean bean = new DepartmentBean();
		bean.setDeptName("HR");
		bean.setDeptId(703);
		return bean;
	}

}
