package com.gestion.absence.controllers;

import com.gestion.absence.entities.Admin;
import com.gestion.absence.repository.AdminRepository;
import com.gestion.absence.service.AjouterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AdminController {


    @Autowired
    private AjouterService ajouterService;
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/profil")
    public String Admin(){

        return "profil";
    }

    @PostMapping("/profil/ajouter")
    public RedirectView ajouterAdmin(@RequestParam("nom") String nom,
                                     @RequestParam("prenom") String prenom,
                                     @RequestParam("email") String email,
                                     @RequestParam("password") String password
    ) {
        Admin admin = new Admin(nom, prenom, email, password);
        ajouterService.AjouterAdmin(admin);
        return new RedirectView("/profil");
    }

}

