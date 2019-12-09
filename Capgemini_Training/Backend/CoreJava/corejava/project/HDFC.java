package com.capgemini.corejava.project;

public class HDFC implements ATM {

	@Override
	public void validateCard() {

		System.out.println(".... connecting to HDFC DB");
		System.out.println("Validating card from HDFC DB");
	}

	@Override
	public void getInfo() {
		System.out.println("...... connecting to HDFC DB");
		System.out.println("Getting info of acc holder from HDFC DB");

	}

}
