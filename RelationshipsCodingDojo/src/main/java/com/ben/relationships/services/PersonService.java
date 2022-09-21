package com.ben.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.ben.relationships.models.Person;
import com.ben.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepo;
	public PersonService(PersonRepository personRepo) {
		this.personRepo = personRepo;
	}
	
	public List<Person> allPersons(){
		return personRepo.findAll();
	}
	
	public Person addPerson(Person person) {
		return personRepo.save(person);
	}
	
	public Person findPerson(Long id) {
		Optional<Person> person = personRepo.findById(id);
		if(person.isPresent()) {
			return person.get();
		}else {
			return null;
		}
	}
	public Person updatePerson(Person person) {
		return personRepo.save(person);
	}

	public void deletePerson(Long id) {
		personRepo.deleteById(id);
		
	}
}