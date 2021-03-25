package com.mycompany.webapp.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.webapp.dto.User;

@Controller
@RequestMapping("/exam06")
public class Exam06Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam06Controller.class);
	
	@GetMapping("/content")
	public String content() {
		return "exam06/content";
	}
	
	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse response) {
		String uid = "spring";
		Cookie cookie = new Cookie("uid", uid);
		//cookie.setDomain("localhost");
		//cookie.setPath("/exam06/content");
		//cookie.setHttpOnly(true);
		//
		cookie.setMaxAge(10);
		response.addCookie(cookie);
		
		Cookie cookie2 = new Cookie("utel", "010-123-1234");
		response.addCookie(cookie2);

		return "redirect:/exam06/content";
	}
	
	/*@GetMapping("/readCookie")
	public String readCookie(HttpServletRequest request) {
		Cookie[] cookieArr = request.getCookies();	// 여러개의 쿠키가 저장될 수 있도록 하기 위해 배열 사용
		for (Cookie cookie : cookieArr) {
			logger.info(cookie.getName() + ": " + cookie.getValue());
			if(cookie.getName().equals("uid")) {
				logger.info(cookie.getValue() + "활용하기");
			}
		}
		return "redirect:/exam06/content";
	}*/
	
	@GetMapping("/readCookie")
	public String readCookie(@CookieValue String uid) {	//쿠키 이름이 uid이면 자동적으로 저장
		logger.info(uid + " 활용하기");
		return "redirect:/exam06/content";
	}
	
	@GetMapping("/deleteCookie")
	public String deleteCookie(HttpServletResponse response) {
		Cookie cookie = new Cookie("uid", "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		return "redirect:/exam06/content";
	}
	
	@GetMapping("/sessionSaveObject")
	public String sessionSaveObject(HttpSession session) {
		User user = new User();
		user.setUid("spring");
		session.setAttribute("user", user);
		return "redirect:/exam06/content";
	}

	@GetMapping("/sessionReadObject")
	public String sessionReadObject(HttpSession session) {
		User user = (User)session.getAttribute("user");
		if (user != null) {
			logger.info("저장된 uid: " + user.getUid());
		}
		return "redirect:/exam06/content";
	}

	@GetMapping("/sessionRemoveObject")
	public String sessionRemoveObject(HttpSession session) {
		//개별 객체를 삭제
		session.removeAttribute("user");
		//세션에 저장된 모든 객체를 삭제할 경우
		session.invalidate();
		return "redirect:/exam06/content";
	}
}
