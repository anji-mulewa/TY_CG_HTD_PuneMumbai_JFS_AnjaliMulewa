package com.capgemini.corejava.project;

public class SBI implements ATM {

	@Override
	public void validateCard() {
		System.out.println(".... connecting to SBI DB");
		System.out.println("Validating card from SBI DB");

	}

	@Override
	public void getInfo() {
		System.out.println("...... connecting to SBI DB");
		System.out.println("Getting info of acc holder from SBI DB");

	}

}
