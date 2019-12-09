package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subjects;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			Subjects sub = new Subjects();
			

			sub.setSubid(5);
			sub.setSubname("HTML");
			sub.setLevel("Moderate");
			transaction.begin();
			em.persist(sub);
			transaction.commit();
			System.out.println("Inserted");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		em.close();

	}
}
