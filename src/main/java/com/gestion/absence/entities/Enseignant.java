package com.gestion.absence.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @AllArgsConstructor @Data @NoArgsConstructor
public class Enseignant extends User {
	
	@OneToMany(mappedBy = "enseignant")
	private List<Module> modules ;

	public Enseignant(String nom, String prenom, String email, String password, List<Module> modules) {
		super(nom, prenom, email, password);
		this.modules = modules;
	}
	
	

	
}
