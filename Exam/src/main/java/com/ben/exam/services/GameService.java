package com.ben.exam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ben.exam.repositories.GameRepository;
import com.ben.exam.models.Game;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepo;
	
	public List<Game> allGames(){
		return gameRepo.findAll();
	}

	public Game addGame(Game game) {
		return gameRepo.save(game);	
	}

	public Game findGame(Long id) {
        Optional<Game> game = gameRepo.findById(id);
        if(game.isPresent()) {
            return game.get();
        } else {
            return null;
        }
    }
	
	public Game updateGame(Game game) {
		return gameRepo.save(game);	
	}

	public void deleteGame(Long id) {
		gameRepo.deleteById(id);
		
	}
	
}
