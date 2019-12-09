package com.capgemini.predicateExample;

import java.util.function.Predicate;

public class StudentPredicate {
public static void main(String[] args) {
	Student s1 = new Student(1,"Anjali",78.45);
	Student s2 = new Student(2,"Snehal",56.6);
	Student s3 = new Student(3,"Pournima",33.2);
	
	Predicate<Student> p = i ->{
		if(i.percentage>=35) {
			return true;
		}else {
			return false;
			
		}
	};
	
	boolean res = p.test(s3);
	System.out.println("Result is "+res);
}
}
