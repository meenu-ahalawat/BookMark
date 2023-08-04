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
	
	@GetMapping("/home")
	public String homePage() {
		log.info("Home Page loading!!");
		return "home";
	}
	
	@GetMapping("/books")
	public String bookPage() {
		log.info("book Page loading!!");
		return "book";
	}
	
	@GetMapping("/about")
	public String aboutPage() {
		log.info("about Page loading!!");
		return "about";
	}
	
	@GetMapping("/mainHome")
	public String signPage() {
		log.info("Main Home Page loading!!");
		return "mainHome";
	}
	
}
