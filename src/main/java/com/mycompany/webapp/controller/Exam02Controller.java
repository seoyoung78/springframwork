package com.mycompany.webapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exam02Controller {
	private static final Logger logger
		= LoggerFactory.getLogger(Exam02Controller.class);
	
	@RequestMapping("/exam02/method1form")
	public String method1form() {
		logger.info("실행");
		return "exam02/method1form";
	}
	
	@RequestMapping("/exam02/method1")
	public String method1(HttpServletRequest request, HttpServletResponse response) {
		logger.info("실행");
		String name = request.getParameter("name");
		logger.info(name);
		return "exam02/method1";
	}
}
