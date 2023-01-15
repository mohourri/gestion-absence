package com.gestion.absence.controllers;

import com.gestion.absence.entities.Etudiant;
import com.gestion.absence.entities.Filiere;
import com.gestion.absence.repository.EtudiantRepository;
import com.gestion.absence.repository.FiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EtudiantController {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @GetMapping("/etudiant")
    public ModelAndView getEtudiant(){
        ModelAndView modelAndView = new ModelAndView("etudiant");
        modelAndView.addObject("listetudiants", etudiantRepository.findAll());
        return  modelAndView;
    }

    @GetMapping ("/addEtudiantForm")
    public ModelAndView addEtudiantForm() {
        ModelAndView mav =  new ModelAndView("add-etudiant-form");

        Etudiant etudiant = new Etudiant();
        mav.addObject("etudiant",etudiant );
        return mav;
    }

    @PostMapping("/saveEtudiant")
    public String saveEtudiant(@ModelAttribute Etudiant etudiant) {
        etudiantRepository.save(etudiant);

        return "redirect:/etudiant";
    }

    @GetMapping ("/showUpdateEtudiantForm")
    public ModelAndView showUpdateEtudiantForm (@RequestParam String CNE)
    {
        ModelAndView mav =  new ModelAndView("add-etudiant-form");
        Etudiant etudiant = etudiantRepository.findById(CNE).get();
        mav.addObject("etudiant", etudiant);
        return mav;

    }
    @GetMapping("/deleteEtudiant")
    public String deleteEtudiant(@RequestParam String CNE) {
        etudiantRepository.deleteById(CNE);
        return "redirect:etudiant";
    }
}
