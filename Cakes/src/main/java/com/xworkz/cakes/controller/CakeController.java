package com.xworkz.cakes.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class CakeController {

	
	
	@RequestMapping("/signup")
	public String signUp(@RequestParam("name")String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password ,Model model){
		
		
		System.out.println("sign up method is running");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		
		model.addAttribute("nameForPage",name);
		model.addAttribute("emailForPage",email);
		model.addAttribute("password",password);
		
		
		return "signin";
	}
	
}