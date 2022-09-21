package com.ben.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ben.relationships.models.Dojo;
import com.ben.relationships.models.Person;
import com.ben.relationships.services.DojoService;
import com.ben.relationships.services.PersonService;


@Controller
public class Persons {
	private final PersonService personService;
	public Persons(PersonService personService) {
		this.personService = personService;
	}
	
	@Autowired
	private DojoService dojoService;
	
	@RequestMapping("/persons")
	public String index(@ModelAttribute("person")Person person, Model model) {
		List<Person> persons = personService.allPersons();
		model.addAttribute("persons", persons);
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "showPersons.jsp";
	}

	@GetMapping("/persons/{person_id}")
	public String showPerson(@PathVariable Long person_id, Model model) {
		
		Person someAwesomePerson = personService.findPerson(person_id);
		model.addAttribute("person", someAwesomePerson);
		
		return "showPerson.jsp";
	}
	
	@RequestMapping("/persons/create")
	public String create(Model model, @ModelAttribute("person")Person person) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "createPersonsForm.jsp";
	}
	
	@PostMapping("/persons/create")
	public String processing(@Valid @ModelAttribute("person") Person person,
						 BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "createPersonsForm.jsp";
		}else {
			this.personService.addPerson(person);
			return "redirect:/persons";
		}
	}
	
	@GetMapping("/persons/edit/{person_id}")
	public String editPerson(@PathVariable Long person_id, Model model) {
		
		Person someAwesomePerson = personService.findPerson(person_id);
		model.addAttribute("person", someAwesomePerson);
		model.addAttribute("dojos", dojoService.allDojos());
		
		return "editPerson.jsp";
	}
	
	@PutMapping(value="/persons/edit/{person_id}")
	public String update(@Valid @ModelAttribute("person") Person person,
						@PathVariable Long person_id, BindingResult result) {
		if(result.hasErrors()) {
			return "editPerson.jsp";
		}else {
			person.setId(person_id);
			personService.updatePerson(person);
			return "redirect:/persons";
		}
	}
	@DeleteMapping(value="/persons/destroy/{id}")
    public String destroy(@PathVariable("id") Long id) {
        personService.deletePerson(id);
        return "redirect:/persons";
    }
	@DeleteMapping(value="/persons/dojo/destroy/{id}")
    public String destroyDojo(@PathVariable("id") Long id) {
        dojoService.deleteDojo(id);
        return "redirect:/persons";
    }
}