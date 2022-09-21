package com.ben.bookclub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ben.bookclub.models.Book;
import com.ben.bookclub.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
    private BookRepository bookRepo;
	
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}

}
