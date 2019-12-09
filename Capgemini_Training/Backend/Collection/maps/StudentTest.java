package com.capgemini.maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class StudentTest {
public static void main(String[] args) {
	
	Student s1 = new Student(1,"Anjali",76.45);
	Student s2 = new Student(2,"Mayuri",54.57);
	Student s3 = new Student(3,"Aishwarya",83.18);
	Student s4 = new Student(4,"Pournima",63.45);
	Student s5 = new Student(5,"Smita",46.83);
	Student s6 = new Student(6,"Prachi",92.87);
	Student s7 = new Student(7,"Sakshi",68.46);
	Student s8 = new Student(8,"Sneha",89.08);
	Student s9 = new Student(9,"Snehal",67.34);

	ArrayList<Student> al1 = new ArrayList<Student>();
	al1.add(s1);
	al1.add(s2);
	al1.add(s3);
	
	ArrayList<Student> al2 = new ArrayList<Student>();
	al2.add(s4);
	al2.add(s5);
	
	
	ArrayList<Student> al3 = new ArrayList<Student>();
	al3.add(s6);
	al3.add(s7);
	al3.add(s8);
	al3.add(s9);

	LinkedHashMap<String,ArrayList<Student>> lhm = new LinkedHashMap<String,ArrayList<Student>>();

	lhm.put("First",al1);
	lhm.put("Second",al2);
	lhm.put("Third",al3);

	ArrayList<Student> al = lhm.get("Third");
	Iterator<Student> it = al.iterator();
	while(it.hasNext()) {
		Student s = it.next();
		System.out.println("name is :"+s.name);
		System.out.println("Id is "+s.id);
		System.out.println("Percentage is "+s.percentage);
		System.out.println("-----------");
	}

}
}
