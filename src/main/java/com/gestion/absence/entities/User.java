package com.gestion.absence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @ToString 
public class User  {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long ID;
	String nom;
	String prenom;
	String email;
	String password;
	
	public User(String nom, String prenom, String email, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
	}

}
