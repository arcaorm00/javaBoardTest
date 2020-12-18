package com.example.demo.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardVo {

	private int id;
	private String title;
	private String content;
	private String writer;
	private int hit;
	private Date regdate;
}
