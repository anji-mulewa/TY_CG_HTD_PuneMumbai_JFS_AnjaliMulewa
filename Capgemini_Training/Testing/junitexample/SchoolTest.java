package com.capgemini.junitexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SchoolTest {

	private School school;
	
	@BeforeEach
	public void createObject() {
		school = new School();
	}
	
	@Test
	public void testRegisterStudent() {
		Student student = new Student("Abcd", 68.92, 'F');
		Student stu = school.registerSchool(student);
		assertEquals(1,stu.getId());
	}
	
	@Test
	public void testRegisterStudentForNull() {
		assertThrows(NullPointerException.class, () -> school.registerSchool(null));
	}
}
