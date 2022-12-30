package com.gestion.absence.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.gestion.absence.entities.Enseignant;
import com.gestion.absence.entities.Filiere;
import com.gestion.absence.service.AjouterService;

@Controller
public class FiliereController {
	@Autowired
	private AjouterService ajouterService;
	
	@RequestMapping("/filieres")
	public String filieres() {
		return "filieres";
	}
	
	@PostMapping("/filieres/add")
	public RedirectView ajouterFiliere(@RequestParam("libelle") String libelle) {
		Filiere filiere = new Filiere(new Long(0), libelle, new ArrayList<>());
		ajouterService.AjouterFiliere(filiere);
        return new RedirectView("/");
	}
}
