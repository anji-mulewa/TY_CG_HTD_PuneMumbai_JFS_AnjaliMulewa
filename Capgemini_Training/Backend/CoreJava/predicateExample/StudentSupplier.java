package com.capgemini.predicateExample;

import java.util.function.Supplier;

public class StudentSupplier {
public static void main(String[] args) {
	Supplier<Student> s = ()->new Student();
	Student s1 = s.get();
	Student s2 =s.get();
	
	System.out.println(s1);
	System.out.println(s2);
	
	
}
}
