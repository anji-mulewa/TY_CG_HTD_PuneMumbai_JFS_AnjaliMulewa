package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDynamic {
public static void main(String[] args) {
	EntityManagerFactory emf =         Persistence.createEntityManagerFactory("test");
	EntityManager em = emf.createEntityManager();
	EntityTransaction transaction = em.getTransaction();
	transaction.begin();
	String jpql="update Movies set mname=:mn where id =:mid";
	Query query = em.createQuery(jpql);
	query.setParameter("mn", "Doctor Strange");
	query.setParameter("mid", 1);
	int res = query.executeUpdate();
	
	
	transaction.commit();
	System.out.println("Updated" +res);

}
}
