package com.capgemini.empwebapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.empwebapp.beans.EmployeeInfoBean;

public class EmployeeDAOJpaImpl implements EmployeeDAO {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeePersistenceUnit");

	@Override
	public EmployeeInfoBean getEmployee(int empId) {

		EntityManager manager = emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		manager.close();
		return employeeInfoBean;
	}// end of getEmployee()

	@Override
	public EmployeeInfoBean authenticate(int empId, String pwd) {
		EntityManager em = emf.createEntityManager();
		String jpql = "from EmployeeInfoBean where empId =:empId and password= :pwd";
		Query query = em.createQuery(jpql);
		query.setParameter("empId", empId);
		query.setParameter("pwd", pwd);
		EmployeeInfoBean employeeInfoBean = null;
		try {
			employeeInfoBean = (EmployeeInfoBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeInfoBean;
	}// end of authenticate() method

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			em.persist(employeeInfoBean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return isAdded;
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		EmployeeInfoBean existingEmployeeInfo = em.find(EmployeeInfoBean.class, employeeInfoBean.getEmpId());
		boolean isUpdated = false; 

		if (existingEmployeeInfo != null) {
			String name = employeeInfoBean.getEmpName();
			if (name != null) {
				existingEmployeeInfo.setEmpName(name);
			}
			int age = employeeInfoBean.getAge();
			if (age > 18) {
				existingEmployeeInfo.setAge(age);
			}
			double salary = employeeInfoBean.getSalary();
			if (salary > 0) {
				existingEmployeeInfo.setSalary(salary);
			}
			long mobile = employeeInfoBean.getMobile();
			if (mobile > 0) {
				existingEmployeeInfo.setMobile(mobile);
			}
			String designation = employeeInfoBean.getDesignation();
			if (designation != null) {
				existingEmployeeInfo.setDesignation(designation);
			}
			char gender = employeeInfoBean.getGender();
			if (gender == 'M' | gender == 'F' | gender == 'm' | gender == 'f') {
				existingEmployeeInfo.setGender(gender);
			}
			String pwd = employeeInfoBean.getPassword();
			if (pwd != null) {
			}
			existingEmployeeInfo.setPassword(pwd);
		}

		try {
			transaction.begin();
			em.persist(existingEmployeeInfo);
			transaction.commit();
			isUpdated = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return isUpdated;
	}

}// end of class
