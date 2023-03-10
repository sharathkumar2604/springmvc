package com.xworkz.bag.service;

import org.springframework.ui.Model;

import com.xworkz.bag.dto.BagDto;

public interface BagService {

	public String save(BagDto dto, Model model);

}
