package com.ben.gamesexam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ben.gamesexam.models.Game;
import com.ben.gamesexam.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
    private GameRepository gameRepo;
	
	public List<Game> allGames(){
		return gameRepo.findAll();
	}

}
