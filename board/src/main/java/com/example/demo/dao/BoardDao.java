package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.BoardManager;
import com.example.demo.vo.BoardVo;

@Repository
public class BoardDao {

	public List<BoardVo> listBoard(){
		return BoardManager.selectAllBoard();
	} 
	
	public BoardVo getBoard(int id) {
		return BoardManager.getBoard(id);
	}
	
	public int insertBoard(BoardVo b) {
		return BoardManager.insertBoard(b);
	}
	
	public int updateBoard(BoardVo b) {
		return BoardManager.updateBoard(b);
	}
	
	public int plusHit(int id) {
		return BoardManager.plusHit(id);
	}
	
	public int deleteBoard(int id) {
		return BoardManager.deleteBoard(id);
	}
}
