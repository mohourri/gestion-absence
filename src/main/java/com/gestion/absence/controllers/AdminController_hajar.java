package com.gestion.absence.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController_hajar {

	
	@GetMapping("/")
	public String home() {
		
		return "GestionEnseignant";
				
	}
	@GetMapping("/filiere")
	public String filiere() {
		
		return "gestionFiliere";
				
	}
}
