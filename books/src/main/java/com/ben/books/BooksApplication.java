package com.ben.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class BooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}
//	@RequestMapping("/")
//	public String hello() {
//		return "Hello world";
//	}
//	
//	@RequestMapping("/message")
//	public String message() {
//		return "message";
//	}

}
