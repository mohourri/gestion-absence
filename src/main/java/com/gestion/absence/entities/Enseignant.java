package com.gestion.absence.entities;

import java.util.ArrayList;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class Enseignant extends User {
	
	@OneToMany()
	@JoinColumn(name = "ID")
	private ArrayList<Module> modules = new ArrayList<Module>();

	
}
