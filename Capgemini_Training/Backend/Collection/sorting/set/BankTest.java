package com.capgemini.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class BankTest {
	public static void main(String[] args) {
		ById comp = new ById();
		ByName comp1 = new ByName();
		ByMicr comp2 = new ByMicr();
		TreeSet<Bank> ts = new TreeSet<Bank>(comp2);
		
		Bank b1 = new Bank(123, "SBI",122345l);
		Bank b2 = new Bank(321, "BOI",122355l);
		Bank b3 = new Bank(435, "HDFC",452267l);
		Bank b4 = new Bank(562, "Axis", 345864l);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Pin is: "+b.pin);
			System.out.println("Name is: "+b.name);
			System.out.println("Micr is: "+b.micr);
		}
	}

}
