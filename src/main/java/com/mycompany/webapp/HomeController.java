package com.mycompany.webapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {	
	private static final Logger logger
					= LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/")
	public String home() {
		logger.error("error 메시지");
		logger.warn("warn 메시지");
		logger.info("info 메시지");
		logger.debug("debug 메시지");
		return "home";
	}
	
}
