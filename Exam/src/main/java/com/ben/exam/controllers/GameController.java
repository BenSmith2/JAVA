package com.ben.exam.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ben.exam.models.Game;
import com.ben.exam.services.GameService;
import com.ben.exam.services.UserService;




@Controller
public class GameController {
	private final GameService gameService;
	public GameController(GameService gameService) {
		this.gameService = gameService;
	}
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String home(HttpSession session, Model model) {
	 
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		
		Long userId = (Long) session.getAttribute("userId");
		model.addAttribute("user", userService.findById(userId));
		List<Game> games = gameService.allGames();
		model.addAttribute("games", games);
		
	    return "home.jsp";
	    
	}
	
	@RequestMapping("/games/new")
	public String index(HttpSession session,@ModelAttribute("game")Game game) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		Long userId = (Long) session.getAttribute("userId");
		game.setUser(userService.findById(userId));
		return "NewGame.jsp";
	}
	@PostMapping("/games/new")
	public String create(HttpSession session,@Valid @ModelAttribute("game")Game game, 
						 BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "NewGame.jsp";
		}else {
			Long userId = (Long) session.getAttribute("userId");
			game.setUser(userService.findById(userId));
			gameService.addGame(game);
			return "redirect:/home";
		}
	}
	
	@RequestMapping(value="/games/{id}")
    public String showOne(HttpSession session,@PathVariable("id") Long id, Model model) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		Game findGame = gameService.findGame(id);
		model.addAttribute("game", findGame);
        return "ShowGame.jsp";
    }
	
	@RequestMapping("/games/edit/{id}")
	public String edit(HttpSession session,@ModelAttribute("game")Game game,@PathVariable("id") Long id, Model model) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		Game findGame = gameService.findGame(id);
		model.addAttribute("game", findGame);
		return "edit.jsp";
	}
	@PutMapping(value="/games/edit/{id}")
    public String update(@PathVariable("id") Long id, HttpSession session,@Valid @ModelAttribute("game") Game game,BindingResult result,Model model ) {
        if (result.hasErrors()) {

            return "edit.jsp";
        } else {
        	Long userId = (Long) session.getAttribute("userId");
			game.setUser(userService.findById(userId));
            gameService.updateGame(game);
            return "redirect:/home";
        }
    }
	
	
	@DeleteMapping(value="/games/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
        gameService.deleteGame(id);
        return "redirect:/home";
    }
	
}