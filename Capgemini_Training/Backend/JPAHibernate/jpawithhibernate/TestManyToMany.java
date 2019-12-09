package com.capgemini.jpawithhibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.manytomany.Course;
import com.capgemini.jpawithhibernate.manytomany.Student;

public class TestManyToMany {
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction transaction = null;

		List<Course> c1 = new ArrayList<Course>();
		Course course1 = new Course();
		course1.setCid(101);
		course1.setCname("Java");
		c1.add(course1);

		Course course2 = new Course();
		course2.setCid(102);
		course2.setCname("JDBC");
		c1.add(course2);

		Student student1 = new Student();
		student1.setid(1);
		student1.setname("Anjali");
		student1.setCourse(c1);

		Student student2 = new Student();
		student2.setid(2);
		student2.setname("Snehal");

		try {
			emf = Persistence.createEntityManagerFactory("test");
			em = emf.createEntityManager();
			transaction = em.getTransaction();
			transaction.begin();
			// em.persist(student1);
			// em.persist(student2);
			Course course3 = em.find(Course.class, 101);
			System.out.println("Course id is: " + course3.getCid());
			System.out.println("Course name is: " + course3.getCname());
			System.out.println("Student name is: " + course3.getStudent().get(0).getname());
			System.out.println("Student id is: " + course3.getStudent().get(0).getid());
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}