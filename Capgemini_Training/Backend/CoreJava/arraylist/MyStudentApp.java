package com.capgemini.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MyStudentApp {
static Scanner s = new Scanner(System.in);
private static ArrayList<Student> al = new ArrayList<Student>();	
void add() {
	System.out.println("Enter id");
	int id = s.nextInt();
	System.out.println("Enter name");
	String name = s.next();
	System.out.println("Enter percentage");
	double percentage =s.nextDouble();
	Student s = new Student(id,name,percentage);
	al.add(s);
	
}

void display() {
Iterator<Student> it = al.iterator();
while(it.hasNext()) {
	Student s=it.next();
	System.out.println("Id is: "+s.id);
	System.out.println("Name is: "+s.name);
	System.out.println("Percentage is: "+s.percentage);
	System.out.println("-----------------------");
}
	}
}

