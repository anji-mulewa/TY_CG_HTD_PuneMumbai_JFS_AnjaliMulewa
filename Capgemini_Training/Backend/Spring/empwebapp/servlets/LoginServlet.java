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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//get form data
		int empIdVal = Integer.parseInt(req.getParameter("empId"));
		String password = req.getParameter("password");

		EmployeeDAO dao = new EmployeeDAOJpaImpl();
		EmployeeInfoBean employeeInfoBean = dao.authenticate(empIdVal, password);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");

		RequestDispatcher dispatcher = null;
		if (employeeInfoBean != null) {
			HttpSession session = req.getSession(true);
			//session.setMaxInactiveInterval(60);
			session.setAttribute("empInfo", employeeInfoBean);
			out.println("<h2> Hello " + employeeInfoBean.getEmpName() + "</h2>");
			dispatcher = req.getRequestDispatcher("./homePage.html");

		} else {
			out.println("<h3 style= \"color:red \">Invalid Credentials</h3>");
			dispatcher = req.getRequestDispatcher("./loginForm.html");
		}

		dispatcher.include(req, resp);
		out.println("</body>");
		out.println("</html>");
	}// end of doPost()
}// end of class
