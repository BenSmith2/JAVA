package com.ben.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class DemosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemosApplication.class, args);
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
