package com.tallerback.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.tallerback.entity.Persona;
import com.tallerback.services.PersonaService;


@RestController
@RequestMapping(path="/persona")
@CrossOrigin(origins = "*")
public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	
	@GetMapping
	public List<Persona> getAll(){
		return personaService.findAllPersona();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Persona> getById(@PathVariable String id) {
		Optional<Persona> usr = personaService.findPersonaById(id);
		if(usr != null) {
			return usr;
		}
		return null;
	}
	
	@PostMapping
	public void insert(@RequestBody Persona nuevoPersona) {
		if(personaService.findPersonaById(nuevoPersona.getIdentificacion()).isPresent()) {
			throw new ResponseStatusException(HttpStatus.ALREADY_REPORTED, "Usuario ya creado");
		}
		personaService.savePersona(nuevoPersona);
	}
	
	@PutMapping
	public Persona modify(@RequestBody Persona persona) {
		Persona modificado = personaService.updatePersona(persona);
		if(modificado == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado");
		}
		return modificado;
	}
	
	@DeleteMapping
	public void delete(@RequestBody Persona personaABorrar) {
		if(personaService.deletePersona(personaABorrar.getIdentificacion())!=null) {
			throw new ResponseStatusException(HttpStatus.ACCEPTED,"Borrado");
		}
		else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No se encontró");
		}
	}
}
