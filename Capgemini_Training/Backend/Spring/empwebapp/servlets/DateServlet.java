package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {

	public DateServlet() {
		System.out.println("It is instantiation phase!");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("initialization phase...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("it is service phase");
		Date date = new Date();
//		resp.setHeader("refresh", "1");

		ServletContext context = getServletContext();
//		ServletContext context1 = req.getServletContext();
		String companyNameVal = context.getInitParameter("companyName");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		/*
		 * out.println("<head>");
		 * out.println("<meta http-equiv=\"refresh\" content='1'>");
		 * out.println("</head>");
		 */
		out.println("<body>");
		out.println("<h1>Current System date and time-<br>");
		out.println("<h2>Context param value is :" + companyNameVal);
		out.println(date + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}// end of doGet

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("it is destroy phase...");
	}
}// end of class
