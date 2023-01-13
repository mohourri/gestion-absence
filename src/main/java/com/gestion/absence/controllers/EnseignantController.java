package com.gestion.absence.controllers;

import com.gestion.absence.service.AjouterService;

import org.springframework.ui.Model;

import com.gestion.absence.entities.Enseignant;
import com.gestion.absence.entities.User;
import com.gestion.absence.repository.EnseignantRepository;
import com.gestion.absence.repository.UserRepository;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class EnseignantController {
	@Autowired
	private AjouterService ajouterService;
	@Autowired
	private EnseignantRepository enseignantRepository;
	
    @GetMapping("/enseignants")
    public ModelAndView listerEnseignants() {
		List<Enseignant> ens = enseignantRepository.findAll();
        return new ModelAndView("enseignants", "ens", ens);
    }

	
	
	
	@PostMapping("/enseignants/ajouter")
	public RedirectView ajouterEnseignant(@RequestParam("nom") String nom,
			@RequestParam("prenom") String prenom,
			@RequestParam("email") String email,
			@RequestParam("password") String password
			) {
		Enseignant ens = new Enseignant(nom, prenom, email, password, null);
		ajouterService.AjouterEnseignant(ens);
        return new RedirectView("/enseignants");
	}
	
	@GetMapping("/enseignants/supprimer/{id}")
    public RedirectView supprimerEnseignant(@PathVariable String id) {
        enseignantRepository.deleteById(Long.parseLong(id));
        return new RedirectView("/enseignants");
    }
	

	@PostMapping("/enseignants/modifier")
    public RedirectView modifierEnseignant(
    		@RequestParam("id") String id,
    		@RequestParam("nom") String nom,
			@RequestParam("prenom") String prenom,
			@RequestParam("email") String email,
			@RequestParam("password") String password) {
		
		Enseignant e = new Enseignant();
		e.setID(Long.parseLong(id));
		e.setNom(nom);
		e.setPrenom(prenom);
		e.setEmail(email);
		e.setPassword(password);
        enseignantRepository.save(e);
        return new RedirectView("/enseignants");    
        
	}
	
	@GetMapping("/enseignants/chercherParNom")
    public ModelAndView chercherEnseignant(	@RequestParam("nom") String nom) {
		List<Enseignant> ens = enseignantRepository.findByNom(nom);
		System.out.println(ens);
        return new ModelAndView("enseignants", "ens", ens);
    }
	

}
