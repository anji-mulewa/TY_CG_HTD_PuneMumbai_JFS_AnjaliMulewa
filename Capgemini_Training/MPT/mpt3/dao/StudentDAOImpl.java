package com.capgemini.mpt3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.mpt3.beans.StudentInfoBean;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public boolean addStudent(StudentInfoBean studentInfoBean) {
		// EntityManagerFactory emf =
		// Persistence.createEntityManagerFactory("studentPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		boolean isAdded = false;
		try {
			transaction.begin();
			em.persist(studentInfoBean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return isAdded;
	}

	@Override
	public StudentInfoBean getStudent(int studentId) {
		EntityManager manager = emf.createEntityManager();
		StudentInfoBean studentInfoBean = manager.find(StudentInfoBean.class, studentId);
		manager.close();
		return studentInfoBean;

	}
}
