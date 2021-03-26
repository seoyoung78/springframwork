package com.mycompany.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.webapp.dto.Board;
import com.mycompany.webapp.dto.Pager;
import com.mycompany.webapp.service.BoardsService;

@Controller
@RequestMapping("/exam08")
public class Exam08Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam08Controller.class);
	
	@Autowired
	private BoardsService boardsService;
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "exam08/loginForm";
	}
	
	@GetMapping("/user/boardlist")
	public String boardlist(String pageNo, HttpSession session, Model model) {
		int intPageNo = 1;
		if(pageNo == null ) {
			// 세션에서 Pager를 찾고, 있으면 pageNo를 설정
			Pager pager = (Pager)session.getAttribute("pager");
			if (pager != null) {
				intPageNo = pager.getPageNo();
			}
		} else {
			intPageNo = Integer.parseInt(pageNo);
		}
				
		int totalRows = boardsService.getTotalRows();
		Pager pager = new Pager(6, 5, totalRows, intPageNo);
		session.setAttribute("pager", pager);
		
		List<Board> list = boardsService.getBoardList(pager);
		model.addAttribute("role","USER");
		model.addAttribute("list", list);
		model.addAttribute("pager", pager);
		return "exam08/boardlist";
	}
	
	@GetMapping("/admin/boardlist")
	public String boardlist2(String pageNo, HttpSession session, Model model) {
		int intPageNo = 1;
		if(pageNo == null ) {
			// 세션에서 Pager를 찾고, 있으면 pageNo를 설정
			Pager pager = (Pager)session.getAttribute("pager");
			if (pager != null) {
				intPageNo = pager.getPageNo();
			}
		} else {
			intPageNo = Integer.parseInt(pageNo);
		}
				
		int totalRows = boardsService.getTotalRows();
		Pager pager = new Pager(6, 5, totalRows, intPageNo);
		session.setAttribute("pager", pager);
		
		List<Board> list = boardsService.getBoardList(pager);
		model.addAttribute("role","ADMIN");
		model.addAttribute("list", list);
		model.addAttribute("pager", pager);
		return "exam08/boardlist";
	}
}
