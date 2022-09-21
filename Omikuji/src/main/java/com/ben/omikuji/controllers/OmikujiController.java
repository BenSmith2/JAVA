package com.ben.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ben.omikuji.models.FormModel;

@Controller
public class OmikujiController {

	@RequestMapping(value = "/")
	public String testForm() {
		
		return "index.jsp";
	}
	
	@RequestMapping(value = "/process", method = RequestMethod.POST)
	public String process(@RequestParam(value="city")String city, HttpSession session, Model model, RedirectAttributes redirectAttributes) {
		
		if(city.isEmpty())
			redirectAttributes.addFlashAttribute("errorMessage", "City cannot be blank");
			
//		FormModel formModel1 = new FormModel(city, city, city);
		
//		session.setAttribute("city", formModel1.getCity()); 
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/omikuji")
	public String omikuji() {
		return "omikuji.jsp";
	}
	
	@RequestMapping(value="/process/omikuji", method = RequestMethod.POST)
	public String processOmikuji(@RequestParam(value="luckyNumber")int luckyNumber, @RequestParam(value="city")String city, 
								 @RequestParam(value="person")String person, @RequestParam(value="hobby")String hobby,
								 @RequestParam(value="livingThing")String livingThing, @RequestParam(value="niceMessage")String niceMessage,
								 HttpSession session, Model model, RedirectAttributes redirect){
		FormModel form2 = new FormModel(luckyNumber,city, person, hobby, livingThing, niceMessage);
		session.setAttribute("luckyNumber", form2.getNumber());
		
		return "redirect:/omikuji/show";
	
	}
	
	@RequestMapping(value = "/omikuji/show")
	public String showOmikuji() {
		return "ShowOmikuji.jsp";
	}
}