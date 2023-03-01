package com.xworkz.sweetspring.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SweetsSpringController {

	public SweetsSpringController() {

	
	}
 
	@RequestMapping("/success")

	public String save()
	{
		return"success.jsp";
	}
	
}
