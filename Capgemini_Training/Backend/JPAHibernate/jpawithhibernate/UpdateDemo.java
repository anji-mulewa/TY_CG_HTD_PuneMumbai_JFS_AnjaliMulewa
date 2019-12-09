package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movies;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test"); //pass the persistence unit name given in persistence.xml file
 entityManager= entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			Movies data =entityManager.find(Movies.class, 2);
			data.setName("Avengers");
			data.setRating("Outstanding");
			System.out.println("Record updated");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();//used if there is any exception
			e.printStackTrace();
		}
		entityManager.close();
	
	}// end of main

}// end of program
