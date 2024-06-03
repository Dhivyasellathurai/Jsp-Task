package com.example.jsp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.jsp.entity.Book;
import com.example.jsp.repository.BookRepository;
import com.example.jsp.service.BookService;

import jakarta.servlet.http.HttpSession;

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

	@GetMapping("/getAllBooks")
	private ModelAndView getAllBook() {
		ModelAndView view = new ModelAndView();
		List<Book> books = bookService.getBooks();
		view.addObject("BookList", books);
		view.setViewName("getAllBook");
		return view;
	}

	@GetMapping("/getBookById/{id}")
	private String getById(@PathVariable int id, HttpSession session) {
		Optional<Book> optional = bookRepository.findById(id);
		Book book = optional.get();
		session.setAttribute("book", book);
		return "getSingleData";
	}

	@GetMapping("/updateBook")
	private String update() {
		return "updateBook";
	}

	@PostMapping("/updateBookDetails")
	@ResponseBody
	private String updateBook(Book book) {
		bookRepository.saveAndFlush(book);
		return "Book Updated successfully";
	}

	@GetMapping("/deleteBook")
	private String deleteBook() {
		return "deleteBook";
	}

	@GetMapping("/deleteBookById")
	@ResponseBody
	private String deleteBook(@RequestParam(value = "id", required = true) Integer id) {
		Optional<Book> optional = bookRepository.findById(id);
		if (optional.isPresent()) {
			bookRepository.deleteById(id);
			return "Book deleted successfully";
		} else {
			return "Book not found";
		}
	}
}