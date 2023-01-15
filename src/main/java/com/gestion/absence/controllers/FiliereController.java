package com.gestion.absence.controllers;

import java.util.ArrayList;

import com.gestion.absence.entities.Enseignant;
import com.gestion.absence.repository.FiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.gestion.absence.entities.Filiere;
import com.gestion.absence.service.AjouterService;

@Controller
public class FiliereController {
	@Autowired
	private FiliereRepository filiereRepository;

	 @GetMapping("/filieres")
	public ModelAndView getFiliere(){
		ModelAndView modelAndView = new ModelAndView("filieres");
		modelAndView.addObject("listfilieres", filiereRepository.findAll());
		return  modelAndView;
	}

	@GetMapping ("/addFiliereForm")
	public ModelAndView addFiliereForm() {
		ModelAndView mav =  new ModelAndView("add-filiere-form");

		Filiere filiere = new Filiere();
		mav.addObject("filiere",filiere );
		return mav;
	}

	@PostMapping("/saveFiliere")
	public String saveFiliere(@ModelAttribute Filiere filiere) {
		filiereRepository.save(filiere);

		return "redirect:/filieres";
	}

	@GetMapping ("/showUpdateFiliereForm")
	public ModelAndView showUpdateFiliereForm (@RequestParam Long ID)
	{
		ModelAndView mav =  new ModelAndView("add-filiere-form");
		Filiere filiere = filiereRepository.findById(ID).get();
		mav.addObject("filiere", filiere);
		return mav;

	}
	@GetMapping("/deleteFiliere")
	public String deleteFiliere(@RequestParam Long ID) {
		filiereRepository.deleteById(ID);
		return "redirect:filieres";
	}

}
