package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subjects;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		Subjects sub = em.find(Subjects.class, 5);
		transaction.begin();
		sub.setSubname("Spring");
		transaction.commit();
		System.out.println("data updated");

	}
}
