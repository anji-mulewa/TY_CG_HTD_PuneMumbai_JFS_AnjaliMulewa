package com.capgemini.array.generic;

public class StudentArrayTest {
	public static void main(String[] args) {
		Student[] st = new Student[4];
		Student s1 = new Student(1, "Ab", 82.18);
		Student s2 = new Student(2, "Cd", 91.6);
		Student s3 = new Student(3, "Ef", 67.8);
		Student s4 = new Student(4, "Gh", 13.2);

		st[0] = s1;
		st[1] = s2;
		st[2] = s3;
		st[3] = s4;

		receive(st);

	}

	static void receive(Student[] ar) {
		for (Student k : ar) {
			System.out.println(k.id);
			System.out.println(k.name);
			System.out.println(k.percentage);
			System.out.println("------------------");
		}
	}
}
