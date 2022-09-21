package com.ben.bookclub.controllers;

import java.util.List;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ben.bookclub.models.Book;
import com.ben.bookclub.services.BookService;
import com.ben.bookclub.services.UserService;




@Controller
public class Books {
	private final BookService bookService;
	public Books(BookService bookService) {
		this.bookService = bookService;
	}
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/d")
	public String test() {
		return "hello";
	}
	
	@RequestMapping("/dashboard")
	public String index(@ModelAttribute("book")Book book, Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		List<Book> dojos = bookService.allBooks();
		model.addAttribute("dojos", dojos);
		return "hello";
	}
}
