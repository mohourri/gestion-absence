package com.gestion.absence.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gestion.absence.repository.EnsiengnantRepository;

public class EnseignanController_hajar {
  EnsiengnantRepository ensiengnantRepository;
  @GetMapping("/delete/{ID}")
  public String deleteenseignant(@PathVariable(name = "ID") Long ID) {
	  ensiengnantRepository.deleteById(ID);
 	 return "/";
  }
}
