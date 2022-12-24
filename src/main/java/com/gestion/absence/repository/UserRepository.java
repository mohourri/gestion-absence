package com.gestion.absence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.absence.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
