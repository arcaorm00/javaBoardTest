package com.example.demo.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.BoardVo;

public class BoardManager {
	
	private static SqlSessionFactory factory;
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int insertBoard(BoardVo b) {
		SqlSession session = factory.openSession();
		int re = session.insert("board.insert", b);
		session.commit();
		session.close();
		return re;
	}
	
	public static List<BoardVo> selectAllBoard() {
		SqlSession session = factory.openSession();
		List<BoardVo> list = session.selectList("board.selectAll");
		session.close();
		return list;
	}
	
	public static BoardVo getBoard(int id) {
		SqlSession session = factory.openSession();
		BoardVo b = session.selectOne("board.selectByID", id);
		session.close();
		return b;
	}
	
	public static int updateBoard(BoardVo b) {
		SqlSession session = factory.openSession();
		int re = session.update("board.update", b);
		session.commit();
		session.close();
		return re;
	}
	
	public static int plusHit(int id) {
		SqlSession session = factory.openSession();
		int re = session.update("board.plusHit", id);
		session.commit();
		session.close();
		return re;
	}
	
	public static int deleteBoard(int id) {
		SqlSession session = factory.openSession();
		int re = session.delete("board.delete", id);
		session.commit();
		session.close();
		return re;
	}

}
