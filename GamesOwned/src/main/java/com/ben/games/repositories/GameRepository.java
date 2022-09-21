package com.ben.games.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ben.games.models.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {

	List<Game> findAll();
	
//	Game findById();
	
}
