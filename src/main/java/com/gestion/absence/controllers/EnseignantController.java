package com.gestion.absence.controllers;

import com.gestion.absence.service.AjouterService;
import com.gestion.absence.entities.Enseignant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class EnseignantController {
	@Autowired
	private AjouterService ajouterService;
	
//	@RequestMapping("/enseignants")
//    public String ajouterEnseignant() {
//		System.out.println("HReloo");
//        return "GestionEnseignant";
//    }
	

	@RequestMapping("/")
	public String home() {
		return "index";
				
	}
	
	@RequestMapping("/enseignants")
	public String enseignants() {
		System.out.println("ha ana !!!!!!!!!!!!!!!!!!!");
		return "GestionEnseignant";
	}
	
	@PostMapping("/enseignants/add")
	public RedirectView ajouterEnseignant(@RequestParam("nom") String nom,
			@RequestParam("prenom") String prenom,
			@RequestParam("email") String email,
			@RequestParam("password") String password
			) {
		Enseignant ens = new Enseignant(nom, prenom, email, password, null);
		ajouterService.AjouterEnseignant(ens);
	    System.out.println(nom+"\n"+prenom+"\n"+email+"\n"+password);
	    System.out.println("HEllo");
        return new RedirectView("/");
	}

}
