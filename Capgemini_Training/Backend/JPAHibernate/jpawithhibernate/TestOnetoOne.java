package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.Person;
import com.capgemini.jpawithhibernate.onetoone.VoterCard;

public class TestOnetoOne {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Person p = new Person();
		p.setPid(1);
		p.setName("Abcd");
		VoterCard vc = new VoterCard();
		vc.setVoter_id(100);
		vc.setaddress("Mumbai");
		p.setVoterCard(vc);
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test"); // pass the persistence
																										 
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
		//	entityManager.persist(p);
		//	System.out.println("Record inserted");
			VoterCard detail= entityManager.find(VoterCard.class, 100);
			System.out.println("Voter id is: "+detail.getVoter_id());
			System.out.println("Address is: "+detail.getaddress());
			System.out.println("Person id is: "+detail.getPerson().getPid());
			System.out.println("Person name is: "+detail.getPerson().getName());
			
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();// used if there is any exception
			e.printStackTrace();
		}
		entityManager.close();
	}// end of main method
}// end of program
