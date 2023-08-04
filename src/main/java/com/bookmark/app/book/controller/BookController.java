package com.bookmark.app.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmark.app.book.repository.BookDetailsRepository;
import com.bookmark.app.dto.BookDetailsDto;
import com.bookmark.app.model.BookModel;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping
@Slf4j
public class BookController {
	
//	ObjectMapper objMapper = new ObjectMapper();
	@Autowired
	private BookDetailsRepository bookDetailsRepository;

	@PostMapping("/addBook")
	public ResponseEntity<Object> addBook(HttpServletRequest request, @RequestBody BookDetailsDto bookDetailsDto){
		BookModel bookDetails = new BookModel();
		bookDetails.setBookName(bookDetailsDto.getBookName());
		bookDetails.setBookPrice(bookDetailsDto.getBookPrice());
		bookDetails.setBookAuthor(bookDetailsDto.getBookAuthor());
		BookModel savedBookDetails = bookDetailsRepository.saveAndFlush(bookDetails);
		return new ResponseEntity<Object>(savedBookDetails, HttpStatus.OK);
	}
}
