package com.gestion.absence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.absence.entities.Cour;

public interface CoursRepository extends JpaRepository<Cour,Long> {

}
