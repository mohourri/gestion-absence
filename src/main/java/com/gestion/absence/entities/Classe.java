package com.gestion.absence.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor 
public class Classe {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long ID;
	Integer niveau;
	
	@ManyToOne
	@JoinColumn(name="id_filliere")
	Filiere filiere;
	
	Integer anneeUniversitaire;
	
	@OneToMany()
	ArrayList<Module> modules = new ArrayList<Module>();
	
	@OneToMany()
	ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
	
	@OneToOne
	@JoinColumn(name="id_emploi")
	EmploiDuTemps emploi;
	

}
