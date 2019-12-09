package com.capgemini.student.maps;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentAppTest {
public static void main(String[] args) {
	Student s1 = new Student(1,"Anjali",'F',78.45);
	Student s2 = new Student(2,"Snehal",'F',56.6);
	Student s3 = new Student(3,"Pournima",'F',33.2);
	Student s4 = new Student(4,"Mayuri",'F',30.79);
	
	Student s5 = new Student(5,"Raju",'M',68.46);
	Student s6 = new Student(6,"Chinnu",'M',45.5);
	Student s7 = new Student(7,"Dinesh",'M',80.74);
	Student s8 = new Student(8,"Abhishek",'M',34.5);
	
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	al.add(s6);
	al.add(s7);
	al.add(s8);
	
	
		
		  Helper h = new Helper();
		   h.Topper(al);
		 
	
}
}
