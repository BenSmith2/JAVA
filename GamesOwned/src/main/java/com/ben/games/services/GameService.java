package com.ben.games.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ben.games.models.Game;
import com.ben.games.repositories.GameRepository;

@Service
public class GameService {
	private final GameRepository gameRepo;
	public GameService(GameRepository gameRepo) {
		this.gameRepo = gameRepo;
	}
	
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
