package com.capgemini.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetomany.Pencil;
import com.capgemini.jpawithhibernate.onetomany.PencilBox;

public class TestOneToMany {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		PencilBox pb = new PencilBox();
		pb.setBoxid(101);
		pb.setName("Natraj");

		Pencil p = new Pencil();
		p.setPid(1);
		p.setColor("Black");
		p.setPencilbox(pb);

		Pencil p1 = new Pencil();
		p1.setPid(2);
		p1.setColor("Red");
		p1.setPencilbox(pb);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test"); // pass the persistence
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			//entityManager.persist(p);
			//entityManager.persist(p1);
			//System.out.println("Record inserted");
			transaction.commit();
			
			 PencilBox detail= entityManager.find(PencilBox.class, 101);
			  System.out.println("PencilBox id is: "+detail.getBoxid());
			  System.out.println("Pencilbox name  is: "+detail.getName());
			 ArrayList<Pencil> al = new ArrayList<Pencil>();
			 for(Pencil li: al) {
				 System.out.println(li.getPid());
				 System.out.println(li.getColor());
			 }

		} catch (Exception e) {
		
			e.printStackTrace();
			transaction.rollback();// used if there is any exception
		}
		entityManager.close();
	}// end of main method
}// end of program
