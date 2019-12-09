package com.capgemini.bean;

public class StudentTest {

	public static void main(String[] args) {
Student s = new Student();
s.setId(20);
s.setName("Abcd");
s.setHeight(5.12);
DataBase db = new DataBase();
db.receive(s);
	}

}
