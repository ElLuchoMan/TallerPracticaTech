package com.tallerback.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tallerback.services.TipoUsuarioServices;
import com.talllerback.models.TipoUsuario;

@RestController
@RequestMapping("tipoUsuario")
@CrossOrigin(origins = "*")
public class TipoUsuarioController {
	
	@Autowired
	TipoUsuarioServices tipoUsuarioService;
	
	@GetMapping("/")
	public List<TipoUsuario> getAllCustomers(){
		return tipoUsuarioService.findAllTipoUsuario();
	}
}
