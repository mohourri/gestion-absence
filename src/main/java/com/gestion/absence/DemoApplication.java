package com.gestion.absence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gestion.absence.entities.Filiere;
import com.gestion.absence.repository.FiliereRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private FiliereRepository fr;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//fr.save(new Filiere(null, "genie info"));
		//fr.save(new Filiere(null, "genie industriel"));
	}

}
