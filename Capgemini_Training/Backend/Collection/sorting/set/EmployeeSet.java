package com.capgemini.sorting.set;

public class EmployeeSet implements Comparable {
	int id;
	String name;
	double salary;
	public EmployeeSet(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	public int compareTo(EmployeeSet e) {
		Integer k = this.id;
		Integer t = e.id;
		return k.compareTo(t);

	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
