package com.example.jsp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.jsp.entity.Book;
import com.example.jsp.repository.BookRepository;
import com.example.jsp.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/home")
	private String home() {
		return "index";
	}

	@GetMapping("/register")
	private String register() {
		return "addBook";
	}

	@PostMapping("/save")
	@ResponseBody
	private String createBook(Book book) {
		bookRepository.save(book);
		System.out.print(book);
		return "Book saved successfully";
	}

	@GetMapping("/getBooks")
	@ResponseBody
	private List<Book> getAllBook() {
		return bookService.getBooks();
	}

	@GetMapping("/getBookById/{id}")
	private Book getById(@PathVariable Integer Id) {
		Optional<Book> optional = bookRepository.findById(Id);
		return optional.get();
	}
}