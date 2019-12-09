package com.capgemini.coreconcepts.cfs;

public class IfElseIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=-90;
		if(marks>=75) {
			System.out.println("Grade A");
		}
		else if(marks< 75 && marks >=50)
		{
			System.out.println("Grade B");
		}
		else if(marks< 50 && marks >=35)
		{
			System.out.println("Grade C");
		} 
		else 
			System.out.println("Fail");

	}

}
