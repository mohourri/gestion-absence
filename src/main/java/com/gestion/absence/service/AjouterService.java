package com.gestion.absence.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestion.absence.entities.Enseignant;
import com.gestion.absence.repository.EnseignantRepository;

@Service
@Transactional
public class AjouterService {
	@Autowired
	EnseignantRepository enseignantRepo;
	
	public void AjouterEnseignant(Enseignant ens) {
		enseignantRepo.save(ens);
	}
}
