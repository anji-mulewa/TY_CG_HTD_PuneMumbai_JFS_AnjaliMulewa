package com.capgemini.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Helper {
	 void display(ArrayList<Student> k) {
		for(Student s : k) {
			System.out.println("Student id:"+s.id);
			System.out.println("Student Name:"+s.name);
			System.out.println("Percentage:"+s.percentage);
			System.out.println("---------------");
		}
	}

	 void onlyPass(ArrayList<Student> k) {
		 Iterator<Student> it = k.iterator();
		
		 while(it.hasNext()) {
			 
			 Student s = it.next();
			 
			 if(s.percentage>=35) {
			 System.out.println("Student id:"+s.id);
				System.out.println("Student Name:"+s.name);
				System.out.println("Percentage:"+s.percentage);
				System.out.println("---------------");
			 }
			 }
		 }
	 void onlyDistinction(ArrayList<Student> k) {
		 Iterator<Student> it = k.iterator();
		 while(it.hasNext()) {
			 Student s = it.next();
			 if(s.percentage>=70) {
				 System.out.println("Student id:"+s.id);
					System.out.println("Student Name:"+s.name);
					System.out.println("Percentage:"+s.percentage);
					System.out.println("---------------");			 
			 }
			 
		 }
	 }
	 }

