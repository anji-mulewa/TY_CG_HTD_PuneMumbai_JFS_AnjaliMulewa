package com.capgemini.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeTest {
public static void main(String[] args) {
	HashSet<Employee> hs = new HashSet<Employee>();
	Employee e1 = new Employee(1,"qwerty" ,56839.83);
	Employee e2 = new Employee(2, "Anjali" ,67304.56);
	Employee e3 = new Employee(3,"Snehal",836873.67);
    Employee e4 = new Employee(4,"Mayuri",2353878.83);
    Employee e5 = new Employee(2, "Anjali" ,67304.56);
    
    hs.add(e1);
    hs.add(e2);
    hs.add(e3);
    hs.add(e4);
    hs.add(e5);
    
    Iterator<Employee> it = hs.iterator();
    while(it.hasNext()) {
    	Employee e = it.next();
    	System.out.println("Name is: "+e.name);
    	System.out.println("id is: "+e.id);
    	System.out.println("Salary is :"+e.salary);
    	System.out.println("-------------");
    }
}
}
