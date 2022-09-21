package com.ben.demos.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionDemo {
	@RequestMapping("/counter/{num}")
	public String session(@PathVariable("num") int num, 
						  HttpSession session, Model model) { 
		
		
		if (session.getAttribute("count")==null) {
			session.setAttribute("count", 1);
		}
		else {
			Integer currentCount = (Integer)session.getAttribute("count");
			currentCount += num;
			session.setAttribute("count", currentCount);
			model.addAttribute("count", currentCount);
		}
		
		return "SessionDemo.jsp";
	}
	@RequestMapping("/counter")
	public String sessionA(HttpSession session, Model model) { 
						  
		
		Integer currentCount = null;
		if (session.getAttribute("count")==null) {
			session.setAttribute("count", 1);
		}
		else {
			currentCount = (Integer)session.getAttribute("count");
			currentCount += 1;
			session.setAttribute("count", currentCount);
			model.addAttribute("count", currentCount);
		}
		
		return "SessionDemo.jsp";
	}
	@RequestMapping("/counter/reset")
	public String sessionB(HttpSession session, Model model) { 
						  
		
		Integer currentCount = null;
		if (session.getAttribute("count")!=null) {
			session.setAttribute("count", 0);
		}
		else {
			currentCount = (Integer)session.getAttribute("count");
			currentCount += 1;
			session.setAttribute("count", currentCount);
			model.addAttribute("count", currentCount);
		}
		
		return "redirect:/counter";
	}
}
