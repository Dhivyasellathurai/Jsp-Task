package com.example.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jsp.entity.Book;
import com.example.jsp.repository.BookRepository;
@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Object getBooks() {
		return bookRepository.findAll();
	}

	public Book addBook(Book book) {
		bookRepository.save(book);
		return book;
	}

}
