package com.capgemini.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.springboot.beans.EmployeeInfoBean;

@Repository //if we give this we don't need to provide configuration 
public class EmployeeDAOJpaImpl implements EmployeeDAO {
	
	@PersistenceUnit //or @Autowired
	private EntityManagerFactory emf;

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

	@Override
	public boolean deleteEmployee(int empId) {
		EntityManager entityManager = emf.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			EmployeeInfoBean employeeInfoBean = entityManager.find(EmployeeInfoBean.class, empId);
			entityManager.remove(employeeInfoBean);
			tx.commit();
			isDeleted = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		entityManager.close();
		return isDeleted;


	}

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from EmployeeInfoBean";
		Query query = manager.createQuery(jpql);

		List<EmployeeInfoBean> employeesList = null;
		try {
			employeesList = query.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeesList;


	}

	}// end of class
