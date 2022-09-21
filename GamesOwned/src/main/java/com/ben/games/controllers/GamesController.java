package com.ben.games.controllers;

//import java.util.Date;
import java.util.List;
//import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

import com.ben.games.models.Game;
import com.ben.games.services.GameService;

@Controller
public class GamesController {
	private final GameService gameService;
	public GamesController(GameService gameService) {
		this.gameService = gameService;
	}

	@RequestMapping("/games")
	public String index(@ModelAttribute("game")Game game, Model model) {
		List<Game> games = gameService.allGames();
		model.addAttribute("games", games);
		return "index.jsp";
	}
	@PostMapping("/games")
	public String create(@Valid @ModelAttribute("game")Game game, 
						 BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Game> games = gameService.allGames();
			model.addAttribute("games", games);
			return "index.jsp";
		}else {
			gameService.addGame(game);
			return "redirect:/games";
		}
	}	
	@RequestMapping("/games/{id}/edit")
	public String edit(@ModelAttribute("game")Game game,@PathVariable("id") Long id, Model model) {
		Game findGame = gameService.findGame(id);
		model.addAttribute("game", findGame);
		return "edit.jsp";
	}
	@PutMapping(value="/games/{id}/edit")
    public String update(@Valid @ModelAttribute("game") Game game, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            gameService.updateGame(game);
            return "redirect:/games";
        }
    }
	
	@RequestMapping(value="/games/{id}")
    public String showOne(@PathVariable("id") Long id, Model model) {
		Game findGame = gameService.findGame(id);
		model.addAttribute("game", findGame);
        return "showOne.jsp";
    }
	@DeleteMapping(value="/games/{id}")
    public String destroy(@PathVariable("id") Long id) {
        gameService.deleteGame(id);
        return "redirect:/games";
    }
}

