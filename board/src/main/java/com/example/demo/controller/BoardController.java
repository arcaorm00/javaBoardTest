package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.BoardDao;
import com.example.demo.vo.BoardVo;

@Controller
public class BoardController {

	@Autowired
	public BoardDao dao;
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView insertBoard(BoardVo b) {
		ModelAndView mav = new ModelAndView();
		int re = dao.insertBoard(b);
		mav.addObject("re", re);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listBoard() {
		ModelAndView mav = new ModelAndView();
		List<BoardVo> list = dao.listBoard();
		mav.addObject("list", list);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getBoard(int id) {
		ModelAndView mav = new ModelAndView();
		BoardVo b = dao.getBoard(id);
		mav.addObject("b", b);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView updateBoard(BoardVo b) {
		ModelAndView mav = new ModelAndView();
		int re = dao.updateBoard(b);
		mav.addObject("re", re);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView deleteBoard(int id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("re", dao.deleteBoard(id));
		return mav;
	}
}
