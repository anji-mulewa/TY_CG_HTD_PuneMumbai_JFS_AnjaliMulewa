package com.capgemini.setexample;

import java.util.Comparator;

public class ById implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		Integer k = o1.getId();
		Integer p = o2.getId();
		return k.compareTo(p);
	}

}
