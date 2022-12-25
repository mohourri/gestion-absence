package com.gestion.absence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.absence.entities.Enseignant;
@Repository
public interface EnseignantRepository  extends JpaRepository<Enseignant, Long>{

}
