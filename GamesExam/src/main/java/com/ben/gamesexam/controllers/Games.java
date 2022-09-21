package com.ben.gamesexam.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ben.gamesexam.models.Game;
import com.ben.gamesexam.services.GameService;
import com.ben.gamesexam.services.UserService;




@Controller
public class Games {
	private final GameService gameService;
	public Games(GameService gameService) {
		this.gameService = gameService;
	}
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String home(HttpSession session, Model model) {
	 
		// If no userId is found, redirect to logout
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		
		// We get the userId from our session (we need to cast the result to a Long as the 'session.getAttribute("userId")' returns an object
		Long userId = (Long) session.getAttribute("userId");
		model.addAttribute("user", userService.findById(userId));
		
	    return "welcome.jsp";
	    
	}
	
	@RequestMapping("/dashboard")
	public String index(@ModelAttribute("book")Game game, Model model) {
		List<Game> games = gameService.allGames();
		model.addAttribute("games", games);
		List<Game> dojos = gameService.allGames();
		model.addAttribute("dojos", dojos);
		return "hello";
	}
}
