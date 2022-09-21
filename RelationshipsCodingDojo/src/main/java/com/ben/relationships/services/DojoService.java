package com.ben.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.ben.relationships.models.Dojo;
import com.ben.relationships.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepo;
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	public Dojo addDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		}else {
			return null;
		}
	}
	public void deleteDojo(Long id) {
		dojoRepo.deleteById(id);
		
	}
}