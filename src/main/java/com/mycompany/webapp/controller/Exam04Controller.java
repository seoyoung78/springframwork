package com.mycompany.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.webapp.dto.Board;
import com.mycompany.webapp.service.Exam04Service;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	@Autowired
	private Exam04Service exam04Service;
	
	@RequestMapping("/content")
	public String content() {
		return "exam04/content";
	}
	
	@GetMapping("/boards")
	public String getBoardList(Model model) {
		List<Board> list = exam04Service.getBoardList();
		model.addAttribute("list", list);
		return "exam04/boardlist";
	}
	
	@PostMapping("/boards")
	public String saveBoard() {
		return "redirect:/boards";
	}
}
