package com.capgemini.mpt3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.mpt3.beans.StudentInfoBean;
import com.capgemini.mpt3.dao.StudentDAO;
import com.capgemini.mpt3.service.StudentService;

@RestController
@CrossOrigin(origins="*" , allowedHeaders = "*")
public class StudentController {
@Autowired
private  StudentService service;

@PutMapping(path="/addStudent" , consumes = MediaType.APPLICATION_JSON_VALUE)
public StudentInfoBean addStudent(StudentInfoBean studentInfoBean) {
	boolean isAdded = service.addStudent(studentInfoBean);
	return studentInfoBean;
}
@GetMapping("/getStudent")
public StudentInfoBean getStudent(int studentId) {
	StudentInfoBean studentInfoBean = service.getStudent(studentId);
	return studentInfoBean;
}
}
