package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movies;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Movies data = entityManager.find(Movies.class, 1);
		System.out.println("Id is: "+data.getId());
		System.out.println("Name is: "+data.getMname());
		System.out.println("Rating is: "+data.getRating());
		
	}
}
