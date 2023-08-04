package com.bookmark.app.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "book_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class BookModel implements Serializable{
	
	private static final long serialVersionUID = -6470090944414208496L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
	@SequenceGenerator(name = "id_sequence", sequenceName = "ID_SEQ")
	private Long bookId;
	
	@Column(name = "book_img")
	private String bookImg;
	
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "book_author")
	private String bookAuthor;
	
	@Column(name = "book_year_of_publish")
	private String bookYearOfPublish;
	
	@Column(name = "book_price")
	private String bookPrice;
	
//	public Long getBookId() {
//		return bookId;
//	}
//	public void setBookId(Long bookId) {
//		this.bookId = bookId;
//	}
//	public String getBookImg() {
//		return bookImg;
//	}
//	public void setBookImg(String bookImg) {
//		this.bookImg = bookImg;
//	}
//	public String getBookName() {
//		return bookName;
//	}
//	public void setBookName(String bookName) {
//		this.bookName = bookName;
//	}
//	public String getBookAuthor() {
//		return bookAuthor;
//	}
//	public void setBookAuthor(String bookAuthor) {
//		this.bookAuthor = bookAuthor;
//	}
//	public String getBookYearOfPublish() {
//		return bookYearOfPublish;
//	}
//	public void setBookYearOfPublish(String bookYearOfPublish) {
//		this.bookYearOfPublish = bookYearOfPublish;
//	}
//	public String getBookPrice() {
//		return bookPrice;
//	}
//	public void setBookPrice(String bookPrice) {
//		this.bookPrice = bookPrice;
//	}
//	
//	public BookModel() {}
//	
//	public BookModel(Long bookId, String bookImg, String bookName, String bookAuthor, String bookYearOfPublish,
//			String bookPrice) {
//		super();
//		this.bookId = bookId;
//		this.bookImg = bookImg;
//		this.bookName = bookName;
//		this.bookAuthor = bookAuthor;
//		this.bookYearOfPublish = bookYearOfPublish;
//		this.bookPrice = bookPrice;
//	}
//	@Override
//	public String toString() {
//		return "BookModel [bookId=" + bookId + ", bookImg=" + bookImg + ", bookName=" + bookName + ", bookAuthor="
//				+ bookAuthor + ", bookYearOfPublish=" + bookYearOfPublish + ", bookPrice=" + bookPrice + "]";
//	}
}
