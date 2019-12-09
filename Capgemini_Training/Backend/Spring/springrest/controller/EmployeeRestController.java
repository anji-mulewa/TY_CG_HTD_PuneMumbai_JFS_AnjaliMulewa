package com.capgemini.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springrest.beans.EmployeeInfoBean;
import com.capgemini.springrest.beans.EmployeeResponse;
import com.capgemini.springrest.service.EmployeeService;

//@Controller
@RestController
@CrossOrigin(origins = "*" , allowedHeaders = "*")
public class EmployeeRestController {
	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/getEmployee", 
			produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	// @ResponseBody
	public EmployeeResponse getEmployee(int empId) {
		EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();
		if(employeeInfoBean !=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee record found..");
			response.setEmployeeInfoBean(employeeInfoBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee Id "+empId+ " not found");
		}
		return response;
	}// end of getEmployee()

	// @ResponseBody
	@PutMapping(path = "/addEmployee",
			consumes = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE },
			produces = {MediaType.APPLICATION_JSON_VALUE , MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isAdded = service.addEmployee(employeeInfoBean);
		EmployeeResponse response = new EmployeeResponse();
		if(isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Added employee successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to add employee");
		}
		return response;
	}

	// @ResponseBody
	@DeleteMapping(path="/deleteEmployee" ,
			produces = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE})
	public EmployeeResponse deleteEmployee(int empId) {
	boolean isDeleted = service.deleteEmployee(empId);
	EmployeeResponse response = new EmployeeResponse();
	if(isDeleted) {
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("Deleted employee successfully");
	} else {
		response.setStatusCode(401);
		response.setMessage("Failed");
		response.setDescription("Unable to delete employee");
	}
	return response;
	}

	@PostMapping(path="/updateEmployee",
			consumes= { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE },
					produces = {MediaType.APPLICATION_JSON_VALUE , MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated = service.updateEmployee(employeeInfoBean);
		EmployeeResponse response = new EmployeeResponse();
		if(isUpdated) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Updated employee successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to update employee");
		}
		return response;
	}

	@GetMapping(path="/getAll" ,
			produces={MediaType.APPLICATION_JSON_VALUE , MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse getAllEmployees() {
		List<EmployeeInfoBean> employeesList = service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();
		if(employeesList !=null && !employeesList.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employees data found");
			response.setEmployeeList(employeesList);
		} else {
			response.setStatusCode(401);
			response.setDescription("Employees data not found");
			response.setMessage("Failed");
		}
		return response;
	}
}
