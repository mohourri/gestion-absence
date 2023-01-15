package com.gestion.absence.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity  @AllArgsConstructor @NoArgsConstructor @ToString @Data
public class Etudiant {
	
	@Id
	String CNE;
	String nom;
	String prenom;
	
	@ManyToOne()
	Classe classe;
	
	@OneToMany(mappedBy = "etudiant")
	ArrayList<Absence> absences = new ArrayList<Absence>();
	
}
