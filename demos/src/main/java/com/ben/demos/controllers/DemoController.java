package com.ben.demos.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;


@Controller
//@RestController
// if not serving up html : @RestController
@RequestMapping("")
public class DemoController {
		@RequestMapping("/")
		public String ouch(@RequestParam(value="q", required = false)String searchQuery, 
						   @RequestParam(value="k", required = false)String firstName,
						   @RequestParam(value="t", required = false)String numTimes) {
			int number = Integer.parseInt(numTimes);
			
			String wordsProcessed = new String(searchQuery +" "+ firstName);
			String sentanceProcessed = new String();
			for (int i = 0; i < number; i++) {
				sentanceProcessed += " " + wordsProcessed;
				}
			return sentanceProcessed;
		}

        @RequestMapping("/hello")
        public String hello() {
                return "Hello World!";
        }
        @RequestMapping("/class")
        public String world() {
                return "Class level annotations are cool too!";
        }
        
        @RequestMapping("/m/{firstName}/{lastName}")
        public String name(@PathVariable("firstName") String firstName,
        				   @PathVariable("lastName") String lastName) {
        	return firstName + " " + lastName;
        }
        
        @RequestMapping("/jsp")
        public String index(Model model) {
        	String fruit = "Banana";
        	model.addAttribute("fruit", fruit);
        	return "index.jsp";
        }
        @RequestMapping("/grace")
        public String graceHopper(Model model) {
        	
        	String name = "Grace Hopper";
        	String itemName = "Copper Wire";
        	double price = 5.25;
        	String description = "Metal strips, illustration of nano secconds.";
        	String vendor = "Ace Hardware";
        	
        	model.addAttribute("name", name);
        	model.addAttribute("item", itemName);
        	model.addAttribute("price", price);
        	model.addAttribute("description", description);
        	model.addAttribute("vendor", vendor);
        	
        	return "gracehopper.jsp";
        }
}
