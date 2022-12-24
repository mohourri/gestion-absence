package com.gestion.absence.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor 
public class Classe {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long ID;
	Integer niveau;
	@ManyToOne
	Filiere filiere;
	String anneeUniversitaire;
	@OneToMany()
	ArrayList<Module> modules = new ArrayList<Module>();
	@OneToMany()
	ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
	

}
