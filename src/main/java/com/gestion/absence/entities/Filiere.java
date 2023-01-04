package com.gestion.absence.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  @AllArgsConstructor @NoArgsConstructor @Data
public class Filiere {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	Long ID;

	String libelle;
	
	@OneToMany
	private List<Classe> classes = new ArrayList<Classe>();

}
