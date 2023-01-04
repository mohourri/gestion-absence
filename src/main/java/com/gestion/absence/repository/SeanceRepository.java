package com.gestion.absence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.absence.entities.Seance;

public interface SeanceRepository extends JpaRepository<Seance, Long> {

}
