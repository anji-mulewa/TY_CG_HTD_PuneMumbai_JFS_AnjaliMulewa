package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subjects;

public class Read {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
	EntityManager em = emf.createEntityManager();
	Subjects data = em.find(Subjects.class, 1);
	System.out.println("Subject id is: "+data.getSubid());
	System.out.println("Subject name is: "+data.getSubname());
	System.out.println("Difficulty level is: "+data.getLevel());
	
}
}
