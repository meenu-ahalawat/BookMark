package com.bookmark.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookmark.app.constant.ApplicationConstant;
import com.bookmark.app.dto.SignupDTO;
import com.bookmark.app.service.SignupService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(ApplicationConstant.API_URL)
@Slf4j
public class SignupController {

	@Autowired
	private SignupService signupService;
	
	@GetMapping(value = "/login")
	public String getSignupPage() {
		log.info("login api started !!");
		return "login";
	}
	
	@PostMapping(value = "/signup")
	public String inisignup(HttpServletRequest request, SignupDTO signupDto){
		log.info("initiateSignup started !!");
		ResponseEntity<Object> response = signupService.register(request, signupDto);
		log.info("Response of signup is : {}", response);
		return "signup";
	}
	
	@GetMapping(value = "/register")
	public String initiateSignup(){
		log.info("initiateSignup started !!");
		ResponseEntity<Object> response = new ResponseEntity<Object>("successful", HttpStatus.OK);
		log.info("Response generated is : {}", response);
		return "signup";
	}
}
