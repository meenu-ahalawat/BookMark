package com.bookmark.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class BookDetailsDto {

	private Long bookId;
	private String bookImg;
	private String bookName;
	private String bookAuthor;
	private String bookYearOfPublish;
	private String bookPrice;
}
