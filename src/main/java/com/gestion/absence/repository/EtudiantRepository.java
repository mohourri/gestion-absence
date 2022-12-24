package com.gestion.absence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.absence.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, String> {
	
	
	
}
