package com.gestion.absence.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestion.absence.entities.Enseignant;
import com.gestion.absence.entities.Filiere;
import com.gestion.absence.repository.EnseignantRepository;
import com.gestion.absence.repository.FiliereRepository;

@Service
@Transactional
public class AjouterService {
	@Autowired
	EnseignantRepository enseignantRepo;
	@Autowired
	FiliereRepository filiereRepo;
	
	public void AjouterEnseignant(Enseignant ens) {
		enseignantRepo.save(ens);
	}

	public void AjouterFiliere(Filiere filiere) {
		filiereRepo.save(filiere);
	}
}
