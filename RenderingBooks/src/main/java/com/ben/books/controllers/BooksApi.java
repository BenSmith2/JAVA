package com.ben.books.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;

//import java.util.List;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ben.books.models.Book;
import com.ben.books.services.BookService;
@Controller
public class BooksApi {
    private final BookService bookService;
    
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    // other methods removed for brevity
    @RequestMapping("/books")
    public String index(Model model) {
        model.addAttribute("books", bookService.allBooks());
        return "index.jsp";
    }
    @RequestMapping("/books/create")
    public String createPage(@ModelAttribute("book") Book book) {
        return "createpage.jsp";
    }
    @PostMapping(value="/books/processing")
    public String create(@Valid @ModelAttribute("book") Book book,
    					 BindingResult result) {
    	if(result.hasErrors()) {
    		return "createpage.jsp";
    	}else{
	    	bookService.createBook(book);
	    	return "redirect:/books";
    	}
    }
    @RequestMapping("/books/{id}")
    public String show(@PathVariable("id")long id, Model model) {
    	Book book = bookService.findBook(id);
    	model.addAttribute("book", book);
    	return "showbook.jsp";
    }
    
    @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
    public Book update(
    		@PathVariable("id") Long id, 
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="desc") String desc, 
    		@RequestParam(value="lang") String lang,
    		@RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        book.setId(id);
        return bookService.updateBook(book);
    }
    
    @RequestMapping(value="/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}