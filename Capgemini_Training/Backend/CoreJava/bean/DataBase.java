package com.capgemini.bean;

public class DataBase {
void receive(Student t) {
	System.out.println(t.getId());
	System.out.println(t.getName());
	System.out.println(t.getHeight());
	
}

void receive(Employee e) {
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getDepartment());
	System.out.println(e.getRole());
	System.out.println(e.getSalary());
}
}
