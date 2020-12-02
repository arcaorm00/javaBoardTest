package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("test", "test");
		return mav;
	}
}
