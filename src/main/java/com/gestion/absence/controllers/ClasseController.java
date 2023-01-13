package com.gestion.absence.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.gestion.absence.entities.Classe;
import com.gestion.absence.entities.Filiere;
import com.gestion.absence.repository.ClasseRepository;
import com.gestion.absence.repository.FiliereRepository;
import com.gestion.absence.repository.ClasseRepository;

@Controller
public class ClasseController {
	

	
	@Autowired 
	private ClasseRepository classeRepository;
	@Autowired 
	private FiliereRepository filiereRepository;
	
	

	
	
	@GetMapping("/classes")
	public String getAllClasses(Model model) {	
		
		List<Classe> listCls = classeRepository.findAll();
		List<Filiere> listFl = filiereRepository.findAll();
		for (Classe c : listCls) {			
			Filiere f = filiereRepository.findById(c.getFiliere().getID()).get();
			c.setNomFilliere(f.getLibelle());
		}
		model.addAttribute("listCls", listCls);
		model.addAttribute("listFl", listFl);
        
		return "classe";
	}
	
	
	@GetMapping("/findClasses")
	public String rechercherClasses(@RequestParam String filiere,Model model){
		
		
		List<Classe> listCls=  new ArrayList<Classe>();
		List<Filiere> listFl = filiereRepository.findAll();
		for (Classe c : classeRepository.findAll()) {
			if(c.getFiliere().getLibelle().toLowerCase().contains(filiere.toLowerCase())) {			
				Filiere f = filiereRepository.findById(c.getFiliere().getID()).get();
				c.setNomFilliere(f.getLibelle());
				listCls.add(c);
			}
		}
		model.addAttribute("listCls", listCls);
		model.addAttribute("listFl", listFl);
		return "classe";
	}
	
	
	@GetMapping("/addClasse")
	public String ajouterClasse(@RequestParam String filiere,
			                     @RequestParam String niveau,
			                     @RequestParam String annee,
			                     Model model) {
		
		
		Classe c = new Classe();
		c.setNiveau(Integer.parseInt(niveau));
		c.setAnneeUniversitaire(Integer.parseInt(annee));
		c.setFiliere(filiereRepository.findById(Long.valueOf(filiere)).get());
		classeRepository.save(c);
		return getAllClasses(model);
	}
	
	@GetMapping("/updateClasse")
	public String modifierClasse(@RequestParam String idEdit,
			@RequestParam String selectFiliereEdit,
            @RequestParam String selectNiveauEdit,
            @RequestParam String anneeEdit,
            Model model) {
        
            Classe c = classeRepository.findById(Long.valueOf(idEdit)).get();
            
            if(c!=null)
            {
            	c.setNiveau(Integer.parseInt(selectNiveauEdit));
        		c.setAnneeUniversitaire(Integer.parseInt(anneeEdit));
        		c.setFiliere(filiereRepository.findById(Long.valueOf(selectFiliereEdit)).get());
        		classeRepository.save(c);   		
        	}
            
            return getAllClasses(model);
	}
	
	@GetMapping("/deleteClasse/{id}")
	public String supprimerClasse(@PathVariable("id") String id, Model model) {
	    Classe c = classeRepository.findById(Long.parseLong(id)).get();
	    classeRepository.delete(c);
	    return getAllClasses(model);
	}
	
	
}
