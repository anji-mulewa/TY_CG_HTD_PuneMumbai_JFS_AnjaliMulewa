package com.capgemini.string;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTestLambda {
	public static void main(String[] args) {
		Comparator<Employee> c =(e1,e2)-> {
			if(e1.height>e2.height) {
				return 1;
			}else if(e1.height<e2.height) {
				return -1;
			}else {
				return 0;
			}
		};

		TreeSet<Employee> ts = new TreeSet(c);
		Employee e1 = new Employee(1,"Priya",5.2);
		Employee e2 = new Employee(3, "Anjali", 5.7);
		Employee e3 = new Employee(2,"Snehal",4.2);
		Employee e4 = new Employee(3, "Sneha", 6.0);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		Iterator<Employee> it = ts.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is :"+e.id);
			System.out.println("name is :"+e.name);
			System.out.println("height is :"+e.height);
			System.out.println("-------------");
		}
	}
}
