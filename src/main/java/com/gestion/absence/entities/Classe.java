package com.gestion.absence.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor 
public class Classe {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long ID;
	Integer niveau;
	
	public Classe(int niveau) {
		this.niveau = niveau;
	}
	
	@ManyToOne
	Filiere filiere;
	
	@Transient
	String nomFilliere;
	Integer anneeUniversitaire;
	
	
	
	@OneToMany(mappedBy = "classe")
	List<Module> modules = new ArrayList<>();
	
	@OneToMany(mappedBy = "classe")
	List<Etudiant> etudiants = new ArrayList<>();
	
	@OneToOne
	EmploiDuTemps emploi ;
	

}
