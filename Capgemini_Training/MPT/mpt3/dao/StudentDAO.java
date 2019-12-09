package com.capgemini.mpt3.dao;

import com.capgemini.mpt3.beans.StudentInfoBean;

public interface StudentDAO {

	public boolean addStudent(StudentInfoBean studentInfoBean);
	public StudentInfoBean getStudent(int studentId);

}
