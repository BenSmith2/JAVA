package com.ben.gamesexam.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ben.gamesexam.models.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
 
	List<Game> findAll();
}