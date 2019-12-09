package com.capgemini.predicateExample;

import java.util.function.Consumer;

public class StudentConsumer {
	public static void main(String[] args) {
		Consumer<Student> a= (s)->{
			System.out.println("Name is "+s.name);
			System.out.println("Id is "+s.id);
			System.out.println("Percentage is "+s.percentage);
		};
		Student s = new Student(1,"Abcd",78.4);
		a.accept(s);

	}
}
