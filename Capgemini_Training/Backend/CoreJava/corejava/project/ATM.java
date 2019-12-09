package com.capgemini.corejava.project;

public interface ATM {
	/*Every class that is implementing ATM 
	 * should have the methods given below 
	 * It is used for validating the card and to get the details 
	 * of the account holder from the particular bank DB
	 */
void validateCard();
void getInfo();

}
