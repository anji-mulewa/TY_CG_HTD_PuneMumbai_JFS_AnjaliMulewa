package com.capgemini.mpt3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.mpt3.beans.StudentInfoBean;
import com.capgemini.mpt3.dao.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDAO dao;

	@Override
	public boolean addStudent(StudentInfoBean studentInfoBean) {
		return dao.addStudent(studentInfoBean);
	}

	@Override
	public StudentInfoBean getStudent(int studentId) {
		return dao.getStudent(studentId);

	}
	
}
