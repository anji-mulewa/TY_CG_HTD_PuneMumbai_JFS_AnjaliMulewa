package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.empwebapp.beans.EmployeeInfoBean;
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOJpaImpl;

@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session != null) {
			
			int empId = Integer.parseInt(req.getParameter("empId"));
			String ageVal = req.getParameter("age");
			String mobileVal =req.getParameter("mobile");
			String salaryVal = req.getParameter("salary");
			String empName = req.getParameter("empName");
			String password = req.getParameter("password");
			String designation = req.getParameter("designation");
			String genderVal = req.getParameter("gender");
			
			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			if(empName !=null && !empName.isEmpty()) {
				employeeInfoBean.setEmpName(empName);
			}
			if(ageVal != null && !ageVal.isEmpty()) {
				employeeInfoBean.setAge(Integer.parseInt(ageVal));
			}
			if(salaryVal !=null && !salaryVal.isEmpty()) {
				employeeInfoBean.setSalary(Double.parseDouble(salaryVal));
			}
			if(mobileVal != null && !mobileVal.isEmpty()) {
				employeeInfoBean.setMobile(Long.parseLong(mobileVal));
			}
			if(genderVal != null && !genderVal.isEmpty()) {
				employeeInfoBean.setGender(genderVal.charAt(0));
			}
			if(designation != null && !designation.isEmpty()) {
				employeeInfoBean.setDesignation(designation);
			}
			if(password != null && !password.isEmpty()) {
				employeeInfoBean.setPassword(password);
			}
	
			EmployeeDAO dao = new EmployeeDAOJpaImpl();
			boolean isUpdated = dao.updateEmployee(employeeInfoBean);
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if (isUpdated) {
				out.println("<h2>Employee details updated Successfully</h2>");
			} else {
				out.println("<h2 style='color: red'>Employee ID not found!!!</h2>");
			}
			out.println("</body>");
			out.println("</html>");

		} else {
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style='color: red'>Please login first!!!</h2>");
			out.println("</body>");
			out.println("</html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("./loginForm.html");
			dispatcher.include(req, resp);
		}

	}//end of doPost() method
}//end of class
