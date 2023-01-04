package com.gestion.absence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.absence.entities.EmploiDuTemps;

public interface EmploiRepository  extends JpaRepository<EmploiDuTemps, Long>{

}
