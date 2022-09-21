package com.ben.demos.controllers;



//import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FormPractice {
	@RequestMapping("/form")
	public String formPractice(Model model, HttpSession session) {
		model.addAttribute("emails", session.getAttribute("email"));
//		session.setAttribute("emails");?
		return "FormPractice.jsp";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam(value="email") String emailA, 
					    @RequestParam(value="password") String password, 
					    HttpSession session, RedirectAttributes redirectA) {
		System.out.println(emailA+" "+ password);
//		if(session.getAttribute("email")==null){
//			session.setAttribute("email", emailA);
//		}
		if(password.length()<5) {
			redirectA.addFlashAttribute("error","The password must be 5 or more characters");
			return "redirect:/form";
		}
		session.setAttribute("email", emailA);
//		ArrayList<String> emailList = new ArrayList<String>();
//		emailList = (ArrayList<String>) session.getAttribute("emails");
		return "redirect:/form";
	}
}
