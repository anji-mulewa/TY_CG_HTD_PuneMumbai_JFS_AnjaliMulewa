package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movies;

public class Reattach {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test"); //pass the persistence unit name given in persistence.xml file
			entityManager= entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			Movies movie =entityManager.find(Movies.class, 2);
			System.out.println(movie.getId());
			System.out.println(entityManager.contains(movie));
			//entityManager.clear();
			
			entityManager.detach(movie);
			System.out.println(entityManager.contains(movie));
			Movies movie1 = entityManager.merge(movie);
			movie1.setName("Avengers");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();//used if there is any exception
			e.printStackTrace();
		}
		entityManager.close();
	
	}

}
