package com.capgemini.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.springmvc.bean.EmployeeInfoBean;
import com.capgemini.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@GetMapping("/empLoginForm")
	public String displayEmpLoginForm() {
		return "empLoginForm";
	}// end of displayEmpLoginForm

	@PostMapping("/empLogin")
	public String empLogin(int empId, String password, ModelMap mm, HttpServletRequest req) {
		EmployeeInfoBean employeeInfoBean = service.authenticate(empId, password);
		if(employeeInfoBean!=null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			return "empHomePage";
		} else {
			mm.addAttribute("msg" , "Invalid credentials");
			return "empLoginForm";
		}
	}//end of empLogin()
	@GetMapping("/addEmployeeForm")
	public String displayAddEmpForm(HttpSession session , ModelMap mm ) {
		if(session.isNew()) {
			mm.addAttribute("msg", "Please login first");
			return "empLoginForm";
		} else {
			return "addEmployeeForm";
		}
	}//end of addEmpForm()
	
	@PostMapping("/addEmployee")
	public String addEmployee(EmployeeInfoBean employeeInfoBean , HttpSession session , ModelMap mm) {
		if(session.isNew()) {
			//invalid session
			mm.addAttribute("msg", "Please login first");
			return "empLoginForm";
		} else {
			//valid session
			if(service.addEmployee(employeeInfoBean)) {
				mm.addAttribute("msg", "Employee added successfully");
			} else {
				mm.addAttribute("msg", "Unable to add employee");
			}
			return "addEmployeeForm";
		}
		
	}//
	@GetMapping("/logout")
	public String logout(HttpSession session ,ModelMap mm) {
		session.invalidate();
		mm.addAttribute("msg", "Logged Out Successfully");
		return "empLoginForm";
	}
	
	@GetMapping("/updateEmployeeForm")
	public String displayUpdateEmployeeForm(HttpSession session , ModelMap mm) {
		if(session.isNew()) {
			//invalid session
			mm.addAttribute("msg", "Please login first!!");
			return "empLoginForm";
		} else {
			//valid session
			return "updateEmployeeForm";
		}
	}//end of displayUpdateForm()
	
	@PostMapping("/updateEmployee")
	public String updateEmployee(EmployeeInfoBean employeeInfoBean , HttpSession session , ModelMap mm) {
		if(session.isNew()) {
			//invalid session
			mm.addAttribute("msg", "Please login first!!");
			return "empLoginForm";
		} else {
			if(service.updateEmployee(employeeInfoBean)) {
				mm.addAttribute("msg", "Employee details updated successfully!!");
			} else {
				mm.addAttribute("msg", "Unable to update!!");
			}
			return "updateEmployeeForm";
		}
	}

	@GetMapping("/searchEmployeeForm")
	public String displaySearchEmployeeForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			return "searchEmployeeForm";
		}
	}// End of displaySearchEmployeeForm()
	
	@GetMapping("/searchEmployee")
	public String searchEmployee(int empId, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);
			if (employeeInfoBean != null) {
				modelMap.addAttribute("employeeInfoBean", employeeInfoBean);
			} else {
				modelMap.addAttribute("msg", "Employee ID " + empId + " Not Found!!!");
			}
			
			return "searchEmployeeForm";
		}
	}// End of searchEmployee()
	
	@GetMapping("/deleteEmployeeForm")
	public String displayDeleteEmployeeForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			return "deleteEmployeeForm";
		}
	}// End of displaySearchEmployeeForm()
	
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(int empId, HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			if(service.deleteEmployee(empId)) {
				modelMap.addAttribute("msg", "Employee Deleted Successfully!");
			} else {
				modelMap.addAttribute("msg", "Employee ID " + empId + " Not Found!");
			}
			
			return "deleteEmployeeForm";
		}
	}// End of searchEmployee()
	
	@GetMapping("/seeAllEmployees")
	public String getAllEmployees(HttpSession session, ModelMap modelMap) {
		
		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			List<EmployeeInfoBean> employeesList = service.getAllEmployees();
			modelMap.addAttribute("employeesList", employeesList);
			
			return "displayAllEmployees";
		}
	}// End of getAllEmployees()
	
	@GetMapping("/home")
	public String displayEmpHomePage(HttpSession session, ModelMap modelMap) {

		if (session.isNew()) {
			// Invalid Session
			modelMap.addAttribute("msg", "Please Login First");
			return "empLoginForm";
		
		} else {
			// Valid Session
			return "empHomePage";
		}
	}// End of displayEmpHomePage()
}// end of controller
