package com.ben.books.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping("/api/books")
    public String index(Model model) {
        model.addAttribute("books", bookService.allBooks());
        return "index.jsp";
    }
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title")String title,
    				   @RequestParam(value="desc")String desc,
    				   @RequestParam(value="lang")String lang,
    				   @RequestParam(value="pages")int numP) {
    	Book book = new Book(title, desc, lang, numP);
    	return bookService.createBook(book);
    }
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id")long id) {
    	Book book = bookService.findBook(id);
    	return book;
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
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
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}