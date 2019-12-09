package com.capgemini.mpt3.service;

import com.capgemini.mpt3.beans.StudentInfoBean;

public interface StudentService {
	public boolean addStudent(StudentInfoBean studentInfoBean);
	public StudentInfoBean getStudent(int studentId);

}
