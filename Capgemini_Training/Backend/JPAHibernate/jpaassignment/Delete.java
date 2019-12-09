package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subjects;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			Subjects data = em.find(Subjects.class, 5);
			em.remove(data);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}em.close();
	}
}
