package com.tallerback.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.tallerback.entity.TipoUsuario;
import com.tallerback.services.TipoUsuarioService;

@RestController
@RequestMapping(path="/tipoUsuarios")
@CrossOrigin(origins = "*")
public class TipoUsuarioController {
	
	@Autowired
	TipoUsuarioService tipoUsuarioService;
	
	@GetMapping
	public List<TipoUsuario> getAll(){
		return tipoUsuarioService.findAllTipoUsuario();
	}
	
	@GetMapping(path="/{id}")
	public Optional<TipoUsuario> getById(@PathVariable Long id) {
		Optional<TipoUsuario> usr = tipoUsuarioService.findTipoUsuarioById(id);
		if(usr != null) {
			return usr;
		}
		return null;
	}
	
	@PostMapping
	public void insertNew(@RequestBody TipoUsuario nuevoTipo) {
		tipoUsuarioService.saveTipoUsuario(nuevoTipo);
	}
	
	@PutMapping
	public TipoUsuario modify(@RequestBody TipoUsuario tipoUsuario) {
		if(tipoUsuarioService.findTipoUsuarioById(tipoUsuario.getId_Tipo()).isPresent()) {
			return tipoUsuarioService.updateTipoUsuario(tipoUsuario);
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado");
	}
}
