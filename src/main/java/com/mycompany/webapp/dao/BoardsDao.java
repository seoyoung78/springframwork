package com.mycompany.webapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mycompany.webapp.dto.Board;
import com.mycompany.webapp.dto.Pager;

@Mapper // mybatis에서 자동적으로 인터페이스 구현 객체 생성하여 자동으로 관리 객체로 만들어 줌 --> 코드 작성 시간 줄여줌
public interface BoardsDao {
	public List<Board> selectAll ();
	public List<Board> selectByPage(Pager pager);
	public int insert(Board board);
	public Board selectByBno(int bno);
	public int update(Board board);
	public int deleteByBno(int bno);
	public int updateBhitcount(int bno);
	public int count();
}

/*
@Repository
public class BoardsDao {
	@Autowired
	private SqlSessionTemplate sst;
	
	public List<Board> selectAll () {
		List<Board> list = sst.selectList("boards.selectAll");
		return list;
	}

	public List<Board> selectByPage(Pager pager) {
		List<Board> list = sst.selectList("boards.selectByPage", pager);
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

	public int update(Board board) {
		int rows = sst.update("boards.update", board);
		return rows; 	// 실제 몇 개의 행이 영향을 받았는지 행의 수 리턴
	}

	public int deleteByBno(int bno) {
		int rows = sst.delete("boards.deleteByBno", bno);
		return rows;
	}
	
	public int updateBhitcount(int bno) {
		int rows = sst.update("boards.updateBhitcount", bno);
		return rows;
	}

	public int count() {
		int rows = sst.selectOne("boards.count");
		return rows;
	}

}
*/