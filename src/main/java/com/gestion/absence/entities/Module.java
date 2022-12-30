package com.gestion.absence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor 
public class Module {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	long ID;
	String libelle;
	Integer volumeHoraire;
	@ManyToOne
	Classe classe;
	@ManyToOne
	Enseignant enseignant;
	
	
}
