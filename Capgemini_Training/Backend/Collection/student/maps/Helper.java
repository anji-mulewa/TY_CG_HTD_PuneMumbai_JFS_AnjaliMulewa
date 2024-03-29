package com.capgemini.student.maps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	void displayAll(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is "+s.name);
			System.out.println("Id is "+s.id);
			System.out.println("Gender is "+s.gender);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("---------------");
		}
	}
	void displayPassed(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i->i.percentage>=35).collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is "+s.name);
			System.out.println("Id is "+s.id);
			System.out.println("Gender is "+s.gender);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("---------------");
		}
	}

	void displayFailed(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i->i.percentage<35).collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is "+s.name);
			System.out.println("Id is "+s.id);
			System.out.println("Gender is "+s.gender);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("---------------");
		}

	}

	void displayPassedByGender(ArrayList<Student> al , char g) {
		List<Student> li = al.stream().filter(i->i.percentage>=35 && i.gender==g).collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is "+s.name);
			System.out.println("Id is "+s.id);
			System.out.println("Gender is "+s.gender);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("---------------");
		}

	}

	void displayFailedByGender(ArrayList<Student> al , char g) {
		List<Student> li = al.stream().filter(i->i.percentage>=35 && i.gender==g).collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is "+s.name);
			System.out.println("Id is "+s.id);
			System.out.println("Gender is "+s.gender);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("---------------");
		}

	}

	void Topper(ArrayList<Student> al ) {
		Comparator<Student> comp= (i,j)->{
			if(i.percentage>j.percentage) {
				return 1;
			}else if(i.percentage<j.percentage) {
				return -1;
			}else {
				return 0;		
			}

		};
		Student topper = al.stream().max(comp).get();
		System.err.println("Name is :"+topper.name);
		System.out.println("id is "+topper.id);
		System.out.println("gender is "+topper.gender);
		System.out.println("Percentage is"+topper.percentage);
	}




}
