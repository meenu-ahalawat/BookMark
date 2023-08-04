package com.bookmark.app.service;

import org.springframework.http.ResponseEntity;

import com.bookmark.app.dto.SignupDTO;

import jakarta.servlet.http.HttpServletRequest;

public interface SignupService {

	ResponseEntity<Object> register(HttpServletRequest request, SignupDTO signupDto);

}
