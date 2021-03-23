package com.mycompany.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.webapp.dao.BoardsDao;
import com.mycompany.webapp.dto.Board;

@Service
public class BoardsService {
	@Autowired
	private BoardsDao boardsDao;
	
	public List<Board> getBoardList() {
		List<Board> list = boardsDao.selectAll();
		return list;
	}
	
	public void saveBoard(Board board) {
		boardsDao.insert(board);
	}

	public Board getBoard(int bno) {
		Board board = boardsDao.selectByBno(bno);
		return board;
	}
}
