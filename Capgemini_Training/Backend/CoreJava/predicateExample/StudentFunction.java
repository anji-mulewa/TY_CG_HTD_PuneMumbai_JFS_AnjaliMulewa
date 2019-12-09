package com.capgemini.predicateExample;

import java.util.function.Function;

public class StudentFunction {
public static void main(String[] args) {
	Function<Integer , Student> f = i->{
		Student s = new Student();
		s.id = i;
		return s;
	};

	Student s = f.apply(10);
	System.out.println("Name is "+s.name);
	System.out.println("Id is "+s.id);
	System.out.println("Percentage is "+s.percentage);
}
}
