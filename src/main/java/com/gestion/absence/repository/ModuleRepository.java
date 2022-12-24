package com.gestion.absence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.absence.entities.Module;


public interface ModuleRepository extends JpaRepository<Module, Long> {

}
