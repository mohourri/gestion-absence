package com.gestion.absence.entities;

import java.sql.Date;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity@Table(name="cour") @AllArgsConstructor @NoArgsConstructor @ToString 
public class Cour {
	@Getter @Setter 
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long ID;
	@Getter @Setter 
	Date date; 
	@Getter @Setter 
	Seance seance;
	@Getter @Setter 
	ArrayList<Absence> absences = new ArrayList<Absence>();
	
}
