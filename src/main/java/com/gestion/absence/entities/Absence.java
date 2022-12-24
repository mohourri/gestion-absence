package com.gestion.absence.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity @Table(name="absence")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Absence {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
}
