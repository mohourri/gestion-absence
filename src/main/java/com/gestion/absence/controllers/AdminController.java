package com.gestion.absence.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

	
	@GetMapping("/")
	public String home() {
		
		return "GestionEnseignant";
				
	}
}
