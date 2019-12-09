package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		String jpql="update Movies set mname='qwerty' where id =1";
		Query query = em.createQuery(jpql);
		int res = query.executeUpdate();
		
		
		transaction.commit();
		System.out.println("Updated" +res);
		
	}

}
