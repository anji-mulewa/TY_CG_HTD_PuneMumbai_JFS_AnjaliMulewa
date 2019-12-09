package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movies;

public class Retrival {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
	EntityManager em = emf.createEntityManager();
	String jpql = "from Movies";
	Query query = em.createQuery(jpql);
	List<Movies> list = query.getResultList();
	for(Movies m : list) {
		System.out.println(m.getId());
		System.out.println(m.getMname());
		System.out.println(m.getRating());
	}
	
}
}
