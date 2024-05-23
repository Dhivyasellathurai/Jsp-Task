package com.example.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jsp.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
