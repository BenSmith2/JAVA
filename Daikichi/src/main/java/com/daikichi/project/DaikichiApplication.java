package com.daikichi.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class DaikichiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiApplication.class, args);
	}
	@RestController
	public class HomeController {
        public static void main(String[] args) {
                SpringApplication.run(DaikichiApplication.class, args);
        }

        @RequestMapping("/daikichi")
        public String homePage() {
                return "This is the homepage";
        }
        
        @RequestMapping("/daikichi/travel/{city}")
        public String travel(@PathVariable("city") String city) {
        		
        		return "you will travel to " + city; 
        }

        @RequestMapping("/daikichi/lotto/{num}")
        public String lotto(@PathVariable("num") int num) {
        		if(num % 2 == 0) {
        			return "You will take a grand journey";
        		}
        		else if (num % 2 != 0) {
        			return "Spend time with family";
        		}
        		return "route works"; 
        }
	}
}