package com.gestion.absence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.absence.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin,Long>{

}
