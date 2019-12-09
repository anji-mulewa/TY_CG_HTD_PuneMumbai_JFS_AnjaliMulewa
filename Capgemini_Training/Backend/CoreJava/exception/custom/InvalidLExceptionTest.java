package com.capgemini.exception.custom;

public class InvalidLExceptionTest {
	public static void main(String[] args) {
		Amount a = new Amount();
		try {
			a.check(50000);
			System.out.println("Collect cash");
		} catch (InvalidLimitException e) {
			// anyone of the below messages will do
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
