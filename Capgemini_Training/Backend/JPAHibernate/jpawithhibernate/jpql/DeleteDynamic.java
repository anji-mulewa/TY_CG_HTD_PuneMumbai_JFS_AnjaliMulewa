package com.capgemini.jpawithhibernate.jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDynamic {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
	EntityManager em = emf.createEntityManager();
	EntityTransaction transaction = em.getTransaction();
	Scanner s = new Scanner(System.in);
	transaction.begin();
	String jpql = "delete from Movies where id =:mid";
	Query query = em.createQuery(jpql);
	System.out.println("enter id");
	query.setParameter("mid", s.nextInt());
	int res = query.executeUpdate();
	transaction.commit();
	System.out.println("Deleted "+res);
}
}
