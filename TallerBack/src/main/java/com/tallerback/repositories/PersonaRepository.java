package com.tallerback.repositories;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.tallerback.entity.Persona;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, String>{
	
}