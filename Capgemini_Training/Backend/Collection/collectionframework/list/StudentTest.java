package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class StudentTest {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	Student s = new Student(1,"Ab",56.78);
	Student s1 = new Student(2,"Cd",67.87);
	Student s2 = new Student(3,"Ef" , 78.5);
	Student s3 = new Student(4,"Gh",68.9);
	Student s4= new Student(5,"Ij",74.5);
	al.add(s);
	al.add(s1);
	al.add(s3);
	al.add(s4);
	al.add(s2);
	
	for(int i=0;i<5;i++) {
		Student a = al.get(i);
		System.out.println("Student id:"+s.id);
		System.out.println("Student Name:"+s.name);
		System.out.println("Percentage:"+s.percentage);
	}
}
}
