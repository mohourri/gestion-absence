package com.gestion.absence.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Table(name="etudiant") @AllArgsConstructor @NoArgsConstructor @ToString
public class Etudiant {
	
	@Id
	String CNE;
	String nom;
	String prenom;
	
	@ManyToOne()
	@JoinColumn(name="id_classe")
	Classe classe;
	
	@OneToMany
	ArrayList<Absence> absences = new ArrayList<Absence>();
	
}
