package com.example.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jsp.entity.Book;
import com.example.jsp.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping
	private String getIndex() {
		return "index.jsp";
	}

	@PostMapping("/save")
	private Book createBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}

	@GetMapping("/getBooks")
	private List<Book> getAllBook() {
		return bookService.getBooks();
	}

}