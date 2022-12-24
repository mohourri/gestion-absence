package com.gestion.absence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  @AllArgsConstructor @NoArgsConstructor @Data
public class Filiere {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter 
	Long ID;
	@Getter @Setter 
	String libelle;

}
