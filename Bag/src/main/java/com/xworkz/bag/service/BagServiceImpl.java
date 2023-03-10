package com.xworkz.bag.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.repo.BagRepo;

@Service
public class BagServiceImpl implements BagService {

	@Autowired
	private BagRepo repo;

	@Override
	public String save(BagDto dto, Model model) {

		if (dto != null && dto.getName().length() > 2) {

			String result = repo.save(dto);
			if (result != null) {
				model.addAttribute("Result", "data saved successfully");
				return "Success";
			}

			model.addAttribute("Result", "data not saved");
			return "Home";

		}
		model.addAttribute("Result2", "data is not valid");
		return "Home";

	}
}