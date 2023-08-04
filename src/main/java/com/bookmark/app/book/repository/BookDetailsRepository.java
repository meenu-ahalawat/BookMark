package com.bookmark.app.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmark.app.model.BookModel;

@Repository
public interface BookDetailsRepository extends JpaRepository<BookModel, Long> {

}
