package com.vignesh.wipro.dayscalculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vignesh.wipro.dayscalculator.models.DaysCalculator;
import com.vignesh.wipro.dayscalculator.services.DaysCalculatorService;

@Controller
@RequestMapping("/dayscalculator")
public class DaysCalculatorController {
	
	@Autowired
	private DaysCalculatorService service;
	
	
	@GetMapping("/home")
	public String getHomePage(Model model) {
		DaysCalculator daysCalculator = new DaysCalculator();
		model.addAttribute("daysCalculator" ,daysCalculator);
		return "DaysView";
	}
	
	@PostMapping("/calculate")
	public String calculateDays(Model model, DaysCalculator daysCalculator) {
		try {
			daysCalculator.setDateDifference(service.getDaysDifference(daysCalculator.getStartDate(), daysCalculator.getEndDate()));
		} catch (Exception e) {
			daysCalculator.setErrorMessage(e.getMessage());
			daysCalculator.setDateDifference(0);
		}
		model.addAttribute("daysCalculator",daysCalculator);
		return "DaysView";
	}
	

}
