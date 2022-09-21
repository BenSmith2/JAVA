package com.ben.demos.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ben.demos.models.Item;

@Controller
public class LoopsDemo {
	@RequestMapping("/dojos")
    public String dojos(Model model) {
        ArrayList<String> dojos = new ArrayList<String>();
        dojos.add("Burbank");
        dojos.add("Chicago");
        dojos.add("Bellevue");
        model.addAttribute("dojosFromMyController", dojos);
        return "loops.jsp";
    }
	
	@RequestMapping("/games")
	public String games(Model model) {
		ArrayList<Item> games = new ArrayList<Item>();
		games.add(new Item("Metal Gear Solid", 19.99));
		games.add(new Item("Banjo and Kazooie", 59.99));
		games.add(new Item("Stray", 29.99));
		model.addAttribute("games",games);
//		System.out.println(model);
		
		return "games.jsp";
	}
}