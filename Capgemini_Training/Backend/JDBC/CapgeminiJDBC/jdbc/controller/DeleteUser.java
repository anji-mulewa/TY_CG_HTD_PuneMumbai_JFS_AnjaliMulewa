package com.capgemini.jdbc.controller;

import java.util.Scanner;


import com.capgemin.jdbc.factory.UserFactory;
import com.capgemini.jdbc.dao.UserDAO;
public class DeleteUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDAO dao =UserFactory.getInstance();
		System.out.println("enter user id ");
		int p = sc.nextInt();
		System.out.println("enter password"); 
		String i = sc.next();
		boolean user2 = dao.deleteInfo(p,i);
		if(user2) { 
			System.out.println("Information deleted.."); 
		}else {
			System.out.println("Something went wrong....."); 
		}
		sc.close();
	}
}
