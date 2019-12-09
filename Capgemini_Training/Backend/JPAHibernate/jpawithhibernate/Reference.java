package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movies;

public class Reference {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		  Movies data = entityManager.getReference(Movies.class, 4);
		 //System.out.println(data.getMname());
		 
		/*
		 * Movies getData = entityManager.find(Movies.class, 6);
		 * System.out.println("Id is: "+getData.getMname());
		 */
		/*
		 * System.out.println("Name is: "+data.getMname());
		 * System.out.println("Rating is: "+data.getRating());
		 */
	}

}
