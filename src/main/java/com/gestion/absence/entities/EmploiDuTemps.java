package com.gestion.absence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor 
public class EmploiDuTemps {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long ID;
	
	@OneToOne
	Classe classe;
	
	Integer semestre;
	
}
