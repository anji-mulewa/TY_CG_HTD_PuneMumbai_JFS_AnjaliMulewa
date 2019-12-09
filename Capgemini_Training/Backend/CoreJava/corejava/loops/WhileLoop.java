package com.capgemini.corejava.loops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =5;
		
		
		while(i<=20)
		{
			System.out.println(i);
			i++;
			
		}
		System.out.println("code outside while loop");
		
		/*
		 * while(true) { System.out.println(i); i++;
		 * 
		 * } System.out.println("code outside while loop"); // CTE unreachable statement
		 */
		

	}

}
