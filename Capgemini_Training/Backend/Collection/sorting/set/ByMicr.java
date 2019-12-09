package com.capgemini.sorting.set;

import java.util.Comparator;

public class ByMicr implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		Long k = o1.micr;
		Long p = o2.micr;
		return k.compareTo(p);
	}

}
