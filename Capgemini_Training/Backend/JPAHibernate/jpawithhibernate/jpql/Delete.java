package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
	EntityManager em = emf.createEntityManager();
	EntityTransaction transaction = em.getTransaction();
	transaction.begin();
	String jpql = "delete from Movies where id =2";
	Query query = em.createQuery(jpql);
	int res = query.executeUpdate();
	transaction.commit();
	System.out.println("Deleted "+res);
}
}
