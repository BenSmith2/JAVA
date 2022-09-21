package com.ben.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ben.relationships.models.Dojo;
import com.ben.relationships.services.DojoService;


@Controller
public class Dojos {
	private final DojoService dojoService;
	public Dojos(DojoService dojoService) {
		this.dojoService = dojoService;
	}
	
	
	
	@RequestMapping("/dojos")
	public String allDojosAndPersons(@ModelAttribute("dojo")Dojo dojo, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "showDojos.jsp";
	}
	@RequestMapping("/dojos/{id}")
	public String showDojosAndPersons(@PathVariable("id")Long id, Model model) {
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "showDojos.jsp";
	}
	
	@RequestMapping("/dojos/create")
	public String dojoIndex(@ModelAttribute("dojo")Dojo dojo, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "createDojo.jsp";
	}
	
	@PostMapping("/dojos/create")
	public String dojoProcessing(@Valid @ModelAttribute("dojo") Dojo dojo,
						 BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "redirect:/dojos/create";
		}else {
			dojoService.addDojo(dojo);
			return "redirect:/persons";
		}
	}
	
}