package com.capgemini.sorting.list;

public class Student implements Comparable<Student> {
int id;
String name;
double percentage;
public Student(int id, String name, double percentage) {
	this.id = id;
	this.name = name;
	this.percentage = percentage;
}
//logic to sort according to id by using directly the compare to class
/*@Override
public int compareTo(Student s) {
	Integer k = this.id;
	Integer t = s.id;
	return k.compareTo(t);
}
*/
@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return 0;
}



//logic to sort according to percentage 
/*@Override
public int compareTo(Student s) {
	Double k = this.percentage;
	Double t = s.percentage;
	return k.compareTo(t);
}
*/
//logic to sort according to descending order of name
/*@Override
public int compareTo(Student s) {
	return this.name.compareTo(s.name)*-1; // Descending order
}*/


/*@Override
public int compareTo(Student s) {
	return this.name.compareTo(s.name); // Ascending order
}
*/
//logic to sort according to name
/*@Override
public int compareTo(Student s) {
String k =this.name;
String t =s.name;
int res = k.compareTo(t);
return res;
}
*/


//logic to sort according to percentage
//@Override
/*public int compareTo(Student s) {
	if(this.percentage > s.percentage) {
		return 1;
	}else if(this.percentage < s.percentage) {
		return -1;
	}else {
		return 0;
	}
	
}
*/// Logic to sort according to id
/* @Override
public int compareTo(Student s) {
if(this.id > s.id) {
	return 1;
}else if(this.id < s.id) {
	return -1;
}else {
	return 0;
}
}
*/



}
