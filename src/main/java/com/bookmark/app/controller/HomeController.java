package com.bookmark.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookmark.app.constant.ApplicationConstant;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(ApplicationConstant.API_URL)
@Slf4j
public class HomeController {

	@GetMapping("/books")
	public String bookPage() {
		log.info("book Page loading!!");
		return "book";
	}
	
	@GetMapping("/home")
	public String signPage() {
		log.info("BookMark home Page loading!!");
		return "mainHome";
	}
	
}
