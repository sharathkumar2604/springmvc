package com.xworkz.bag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.service.BagService;

@Component
@RequestMapping("/")
public class BagController {

	@Autowired
	private BagService service;
	
	public BagController() {
System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/save")
	public String onSave(BagDto dto,Model model)
	{
		System.out.println(dto);
		model.addAttribute("name",dto.getName());
		return service.save(dto,model);	
	}
}
