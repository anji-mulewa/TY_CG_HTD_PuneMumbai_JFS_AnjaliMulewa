package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movies;

public class InsertDemo {
	public static void main(String[] args) {
		Movies movie = new Movies();
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		movie.setId(1);
		movie.setName("PK");
		movie.setRating("Outstanding");
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test"); //pass the persistence unit name given in persistence.xml file
            entityManager= entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			System.out.println("Record inserted");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();//used if there is any exception
			e.printStackTrace();
		}
		entityManager.close();
	}// end of main
}// end of program
