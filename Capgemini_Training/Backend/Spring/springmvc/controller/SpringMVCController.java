package com.capgemini.springmvc.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.springmvc.bean.UserBean;

@Controller
public class SpringMVCController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor= new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true);
		
		binder.registerCustomEditor(Date.class, dateEditor);
	}
	
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ModelAndView displayHello() {
		ModelAndView modelAndView = new ModelAndView();
		// modelAndView.setViewName("/WEB-INF/views/hellouser.jsp"); //if viewResolver
		// not configured
		modelAndView.setViewName("hellouser");
		return modelAndView;
	}

	@RequestMapping(path = "/loginForm")
	public ModelAndView displayLoginForm() {
		ModelAndView modelAndView = new ModelAndView();
		// modelAndView.setViewName("/WEB-INF/views/loginForm.jsp");
		modelAndView.setViewName("loginForm");
		return modelAndView;
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest req, ModelAndView modelAndView) {
		String empIdVal = req.getParameter("empId");
		String password = req.getParameter("password");

		req.setAttribute("empId", empIdVal);
		req.setAttribute("pwd", password);

		// modelAndView.setViewName("/WEB-INF/views/userDetails.jsp");
		modelAndView.setViewName("userDetails");
		return modelAndView;
	}// end of login

	@RequestMapping(path = "/login2", method = RequestMethod.POST)
	public String login2(@RequestParam("empId") int empId, @RequestParam("password") String password,
			ModelMap modelMap) {
		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("pwd", password);

		// return "/WEB-INF/views/userDetails.jsp";

		return "userDetails";

	}

	@PostMapping("/login3")
	public String login3(int empId, String password, ModelMap modelMap) {
		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("pwd", password);

		return "userDetails";
	}

	@PostMapping("/login4")
	public String login4(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);
		return "userDetails";
	}
}// end of controller class
