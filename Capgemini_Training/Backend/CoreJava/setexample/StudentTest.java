package com.capgemini.setexample;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentTest {
public static void main(String[] args) {
	ById comp = new ById();
	ByName comp1 = new ByName();
	ByPercent comp2 = new ByPercent();
	ByGender comp3 =new ByGender();
	
	TreeSet<Student> ts = new TreeSet<Student>(comp2);
	Student s1 = new Student();
	s1.setName("Snehal");
	s1.setId(1);
	s1.setGender('F');
	s1.setPercentage(87.24);
	
	
	Student s2 = new Student();
	s2.setName("Mayuri");
	s2.setId(2);
	s2.setGender('F');
	s2.setPercentage(67.45);
	
	
	Student s3 = new Student();
	s3.setName("Pournima");
	s3.setId(3);
	s3.setGender('F');
	s3.setPercentage(65.66);
	
	
	Student s4 = new Student();
	s4.setName("Sneha");
	s4.setId(4);
	s4.setGender('F');
	s4.setPercentage(57.43);
	
	
	Student s5 = new Student();
	s5.setName("Anjali");
	s5.setId(5);
	s5.setGender('F');
	s5.setPercentage(78.24);
	
	
	ts.add(s1);
	ts.add(s2);
	ts.add(s3);
	ts.add(s4);
	ts.add(s5);
	
	
		/*
		 * Iterator<Student> it = ts.iterator(); while(it.hasNext()) { Student s =
		 * it.next(); System.out.println("Name is: "+s.getName());
		 * System.out.println("Id is: "+s.getId());
		 * System.out.println("Gender is: "+s.getGender());
		 * System.out.println("Percentage is: "+s.getPercentage()); }
		 */
	for(Student s : ts) {
		System.out.println("Name is: "+s.getName());
		  System.out.println("Id is: "+s.getId());
		  System.out.println("Gender is: "+s.getGender());
		  System.out.println("Percentage is: "+s.getPercentage());
		System.out.println("------------");
	}
}
}
