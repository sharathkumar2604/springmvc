package com.xwork.fruits.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class FruitsController {
	
	

		public FruitsController() {
		super();
		System.out.println("Fruit Controller");
	}

		@RequestMapping("/organic")
	public String organic(@RequestParam("name") String name, @RequestParam("price") String price,
			@RequestParam("color") String color, Model model) {
		System.out.println("fruits");

		System.out.println(name);
		System.out.println(price);
		System.out.println(color);

		model.addAttribute("name",name);
		model.addAttribute("price",price);
		model.addAttribute("color",color);

		return "fruitShop";

	}
}