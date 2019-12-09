package com.capgemini.corejava.project;

public class ICICI implements ATM {

	@Override
	public void validateCard() {
System.out.println(".... connecting to ICICI DB");
System.out.println("Validating card");
	}

	@Override
	public void getInfo() {
System.out.println("...... connecting to ICICI DB");
System.out.println("Getting info of acc holder");
	}

}
