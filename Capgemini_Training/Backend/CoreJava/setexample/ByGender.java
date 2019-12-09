package com.capgemini.setexample;

import java.util.Comparator;

public class ByGender implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		Character k = o1.getGender();
		Character p = o2.getGender();
		return k.compareTo(p);
	}

}
