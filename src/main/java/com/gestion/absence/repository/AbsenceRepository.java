package com.gestion.absence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.absence.entities.Absence;

public interface AbsenceRepository extends JpaRepository<Absence, Long>{

}
