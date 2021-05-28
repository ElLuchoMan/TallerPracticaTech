package com.tallerback.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tallerback.entity.Persona;
import com.tallerback.repositories.PersonaRepository;

@Service
public class PersonaService {

	@Autowired
	PersonaRepository personaRepository;
	
	public List<Persona> findAllPersona() {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}

	public Optional<Persona> findPersonaById(String id) {
		// TODO Auto-generated method stub
		Optional<Persona> persona = personaRepository.findById(id);
		return persona;
	}

	public Persona savePersona(Persona nuevoUsuario) {
		// TODO Auto-generated method stub
		if(nuevoUsuario != null) {
			return personaRepository.save(nuevoUsuario);
		}
		return new Persona();
	}

	public String deletePersona(String id) {
		// TODO Auto-generated method stub
		if(personaRepository.findById(id).isPresent()) {
			personaRepository.deleteById(id);
			return "Persona borrada correctamente";
		}
		return null;
	}

	public Persona updatePersona(Persona persona) {
		// TODO Auto-generated method stub
		String num = persona.getIdentificacion();
		if(personaRepository.findById(num).isPresent()) {
			Persona personaParaActualizar = new Persona();
			personaParaActualizar.setIdentificacion(persona.getIdentificacion());
			personaParaActualizar.setCorreo(persona.getCorreo());
			personaParaActualizar.setDireccion(persona.getDireccion());
			personaParaActualizar.setNumero_celular(persona.getNumero_celular());
			personaParaActualizar.setPassword(persona.getPassword());
			personaParaActualizar.setPrimer_apellido(persona.getPrimer_apellido());
			personaParaActualizar.setSegundo_apellido(persona.getSegundo_apellido());
			personaParaActualizar.setSegundo_nombre(persona.getSegundo_nombre());
			personaParaActualizar.setPrimer_nombre(persona.getPrimer_nombre());
			personaParaActualizar.setTipoUsuario(persona.getTipoUsuario());
			personaRepository.save(personaParaActualizar);
			return personaRepository.getById(num);
		}
		return null;
	}
}
