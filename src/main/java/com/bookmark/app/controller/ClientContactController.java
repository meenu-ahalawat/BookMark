package com.bookmark.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookmark.app.constant.ApplicationConstant;
import com.bookmark.app.dto.ClientContactDTO;
import com.bookmark.app.service.ClientQueryService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(ApplicationConstant.API_URL)
@Slf4j
public class ClientContactController {
	
	@Autowired
	private ClientQueryService clientQueryService;

	@PostMapping(value = "/contact-query-object")
	public String clientContact(HttpServletRequest request, ClientContactDTO clientContactDto ) {
		log.info("Client contact started.");
		ResponseEntity<Object> response = clientQueryService.saveClientQuery(clientContactDto);
		log.info("Response of signup is : {}", response);
		return "about";
	}
	
	@GetMapping(value = "/about")
	public String clientContactQuery(){
		log.info("Client contact started.");
		ResponseEntity<Object> response = new ResponseEntity<Object>("successfully queried!", HttpStatus.OK);
		log.info("Response generated is : {}", response);
		return "about";
	}
}
