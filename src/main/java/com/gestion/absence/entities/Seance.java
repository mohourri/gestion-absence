package com.gestion.absence.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Table(name="seance") @AllArgsConstructor @NoArgsConstructor  @ToString
public class Seance {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long ID;
	String jour;
	String crenom;
	Enseignant enseignant;
	Module module;
	ArrayList<Cour> cours = new ArrayList<Cour>();
	
	
	
}
