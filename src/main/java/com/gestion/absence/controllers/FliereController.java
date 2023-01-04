package com.gestion.absence.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.gestion.absence.entities.Filiere;
import com.gestion.absence.repository.FiliereRepository;

@Controller
public class FliereController {

	FiliereRepository filiereRepository;
 @GetMapping("/delete/{ID}")
 public String deletefiliere(@PathVariable(name = "ID") Long ID) {
	 filiereRepository.deleteById(ID);
	 return "/";
 }
 

}
