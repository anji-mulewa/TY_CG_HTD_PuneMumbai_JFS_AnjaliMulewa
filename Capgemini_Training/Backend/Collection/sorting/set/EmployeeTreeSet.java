package com.capgemini.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTreeSet {
	public static void main(String[] args) {

		TreeSet<Employee> ts = new TreeSet<Employee>();
		Employee e1 = new Employee(1, "qwerty", 56839.83);
		Employee e2 = new Employee(2, "Anjali", 67304.56);
		Employee e3 = new Employee(3, "Snehal", 836873.67);
		Employee e4 = new Employee(4, "Mayuri", 2353878.83);
		
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		Iterator<Employee> it = ts.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println("Name is: " + e.name);
			System.out.println("id is: " + e.id);
			System.out.println("Salary is :" + e.salary);
			System.out.println("-------------");
		}

	}
}