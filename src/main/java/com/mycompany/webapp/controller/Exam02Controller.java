package com.mycompany.webapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/exam02") // 공통경로
public class Exam02Controller {
	private static final Logger logger
		= LoggerFactory.getLogger(Exam02Controller.class);
	
	@RequestMapping("/method1form")
	public String method1form() {
		logger.info("실행");
		return "exam02/method1form";
	}
	
	@RequestMapping("/method1")
	public String method1(HttpServletRequest request, HttpServletResponse response) {
		logger.info("실행");
		String name = request.getParameter("name");
		logger.info(name);
		request.setAttribute("username", name);
		return "exam02/method1";
	}
	
	@RequestMapping("/method2")
	public String method2() {
		logger.info("실행");
		return "redirect:/home";
	}
	
	//@GetMapping("/method3")
	@RequestMapping(value="/method3", method = RequestMethod.GET)
	public String method3(Model model) {
		logger.info("실행");
		//request.setAttrubute("method", "GET");
		model.addAttribute("method", "GET");
		return "exam02/method";
	}
	
	//@PostMapping("/method3")
	@RequestMapping(value="/method3", method = RequestMethod.POST)
	public String method4(Model model) {
		logger.info("실행");
		model.addAttribute("method", "POST");
		return "exam02/method";
	}
	
	@GetMapping(value="/ajaxmethod3", produces="application/json; charset=UTF-8")
	@ResponseBody
	public String method5(Model model) {
		logger.info("실행");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("method", "GET");
		String json = jsonObject.toString();
		return json;
	}
		
	@PostMapping(value="/ajaxmethod3", produces="application/json; charset=UTF-8")
	@ResponseBody
	public String method6(Model model) {
		logger.info("실행");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("method", "POST");
		String json = jsonObject.toString();
		return json;
	}
	
	@PutMapping(value="/ajaxmethod3", produces="application/json; charset=UTF-8")
	@ResponseBody
	public String method7(Model model) {
		logger.info("실행");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("method", "PUT");
		String json = jsonObject.toString();
		return json;
	}
	
	@DeleteMapping(value="/ajaxmethod3", produces="application/json; charset=UTF-8")
	@ResponseBody
	public String method8(Model model) {
		logger.info("실행");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("method", "DELETE");
		String json = jsonObject.toString();
		return json;
	}
	
}
