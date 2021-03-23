package com.mycompany.webapp.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.webapp.dto.Board;

@Repository
public class BoardsDao {
	@Autowired
	private SqlSessionTemplate sst;
	
	public List<Board> selectAll () {
		List<Board> list = sst.selectList("boards.selectAll");
		return list;
	}
	
	public int insert(Board board) {
		int rows = sst.insert("boards.insert", board);
		return rows;	// 실행 오류 확인을 위해 사용 - 성공 1, 실패 0
	}

	public Board selectByBno(int bno) {
		Board board = sst.selectOne("boards.selectByBno", bno);
		return board;
	}
}
