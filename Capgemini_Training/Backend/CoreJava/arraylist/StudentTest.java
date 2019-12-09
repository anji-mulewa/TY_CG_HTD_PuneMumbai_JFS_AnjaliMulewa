package com.capgemini.arraylist;

import java.util.ArrayList;


public class StudentTest {
public static void main(String[] args) {
	ArrayList<Student> al =new ArrayList<Student>();
	Student s = new Student(1,"Ab",56.78);
	Student s1 = new Student(2,"Cd",67.87);
	Student s2 = new Student(3,"Ef" , 34.5);
	Student s3 = new Student(4,"Gh",78.9);
	Student s4= new Student(5,"Ij",30.5);
	al.add(s);
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);

	Helper h = new Helper();
	
	h.display(al);
	System.out.println("Only pass student......");
	h.onlyPass(al);	
	System.out.println("Only distinction.............");
	h.onlyDistinction(al);
	
	
}
}
