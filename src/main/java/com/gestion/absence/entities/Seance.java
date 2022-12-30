package com.gestion.absence.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity  @AllArgsConstructor @NoArgsConstructor  @ToString
public class Seance {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long ID;
	String jour;
	String creneau;
	
	@ManyToOne
	Enseignant enseignant;
	
	@ManyToOne
	Module module;
	
	@OneToMany(mappedBy = "seance")
	ArrayList<Cour> cours = new ArrayList<Cour>();
	

	
	
	
}
