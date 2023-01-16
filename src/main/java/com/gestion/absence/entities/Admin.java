package com.gestion.absence.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;

@Entity @AllArgsConstructor 
public class Admin extends User {

    public Admin(String nom, String prenom, String email, String password) {
        super(nom, prenom, email, password);
    }
}
