package com.capgemini.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class StudentTest {
public static void main(String[] args) {
	
	
	ArrayList<Student> al = new ArrayList<Student>();
	Student s1 = new Student(1,"Priya",65.4);
	Student s2 = new Student(5,"Anil" , 42.3);
	Student s3 = new Student(3,"Dinesh",51.6);
	Student s4= new Student(2,"Raju",76.8);

	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	
	 Collections.sort(al);
	
	Iterator<Student> it = al.iterator();
	while(it.hasNext()) {
		Student s = it.next();
		System.out.println("name is "+s.name);
		System.out.println("Id is "+s.id);
		System.out.println("Percentage is "+s.percentage);
	System.out.println("---------");
	}
}

	
}

