package com.gestion.absence.entities;

import java.sql.Date;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @AllArgsConstructor @NoArgsConstructor @ToString @Data

public class Cour {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long ID;
	
	Date date; 
	 
	@ManyToOne
	@JoinColumn(name= "id_seance")
	Seance seance;
	 
	@OneToMany(mappedBy = "cour")
	ArrayList<Absence> absences = new ArrayList<Absence>(); 
	
}
