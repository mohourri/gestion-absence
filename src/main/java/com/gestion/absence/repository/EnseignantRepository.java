package com.gestion.absence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.absence.entities.Enseignant;
@Repository
public interface EnseignantRepository  extends JpaRepository<Enseignant, Long>{
	public List<Enseignant> findByNom(String nom);
}
