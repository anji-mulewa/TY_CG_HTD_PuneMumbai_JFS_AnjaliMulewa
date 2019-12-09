package com.capgemini.setexample;

import java.util.Comparator;

public class ByPercent implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
	Double k = o1.getPercentage();
	Double p = o2.getPercentage();
	return k.compareTo(p);
	}

}
