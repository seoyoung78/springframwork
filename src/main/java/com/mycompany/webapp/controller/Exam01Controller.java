package com.mycompany.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.webapp.dto.Board;

@Controller
public class Exam01Controller {	
	private static final Logger logger
					= LoggerFactory.getLogger(Exam01Controller.class);

	@RequestMapping("/home")
	public String home() {
		logger.error("error 메시지");
		logger.warn("warn 메시지");
		logger.info("info 메시지");
		logger.debug("debug 메시지");
		return "home";
	}
	
	@RequestMapping("/exam01/boardlist")
	public String getBoardList(HttpServletRequest request, HttpServletResponse reponse) {
		//요청 내용을 확인
		System.out.println("클라이언트 IP:" + request.getRemoteHost());
		
		//데이터 생성 및 JSP 전달
		List<Board> list = new ArrayList<Board>();
		for (int i = 1; i <= 10; i++) {
			Board board = new Board();
			board.setBno(i);
			board.setBtitle("제목" + i);
			board.setBcontent("내용" + i);
			board.setBwriter("spring");
			list.add(board);
		}
		request.setAttribute("list", list);
		
		//뷰 이름 리턴
		return "exam01/boardlist";
	}
}
