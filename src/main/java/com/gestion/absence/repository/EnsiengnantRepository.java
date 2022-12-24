package com.gestion.absence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.absence.entities.Enseignant;

public interface EnsiengnantRepository  extends JpaRepository<Enseignant, Long>{

}
