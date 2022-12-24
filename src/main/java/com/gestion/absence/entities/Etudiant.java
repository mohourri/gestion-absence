package com.gestion.absence.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
	Classe classe;
	ArrayList<Absence> absences = new ArrayList<Absence>();
	
}
