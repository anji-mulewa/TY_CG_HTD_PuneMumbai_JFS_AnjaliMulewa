package com.capgemini.mpt3.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

@XmlRootElement(name = "student-info")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("studentInfo")
@Entity
@Table(name = "student_info")
public class StudentInfoBean {

	@Id
	@XmlElement
	@Column
	private int studentId;
	@XmlElement
	@Column
	private String studentName;
	@XmlElement
	@Column
	private String emailId;
	@XmlElement
	@Column
	private double aggregate;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getAggregate() {
		return aggregate;
	}

	public void setAggregate(double aggregate) {
		this.aggregate = aggregate;
	}

}
