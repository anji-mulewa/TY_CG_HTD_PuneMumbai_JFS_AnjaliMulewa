package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.beans.EmployeeInfoBean;
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOJpaImpl;

@WebServlet("/searchEmployee")
public class SearchEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Get the form data
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		EmployeeDAO dao = new EmployeeDAOJpaImpl();
		EmployeeInfoBean employeeInfoBean= dao.getEmployee(empId);
		
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();

		out.println("<html>");
		out.println("<body>");
		if(employeeInfoBean !=null) {
		out.print("<h3>Employee Id "+empId + "found-</h3>");
		out.println("Employee Name= "+employeeInfoBean.getEmpName());
		out.println("<br> Employee age= "+employeeInfoBean.getAge());
		out.println("<br> Employee salary= "+employeeInfoBean.getSalary());
		out.println("<br> Employee designation= "+employeeInfoBean.getDesignation());
		out.println("<br> Employee gender= "+employeeInfoBean.getGender());
		out.println("<br> Employee mobile= "+employeeInfoBean.getMobile());
		out.println("<br> Employee password= "+employeeInfoBean.getPassword());
		} else {
			out.println("<h3 style='color: red'> Employee ID " +empId +" Not found!!!");
		}

		out.println("</body>");
		out.println("</html");
		
	}// end of doGet()

}// end of class



