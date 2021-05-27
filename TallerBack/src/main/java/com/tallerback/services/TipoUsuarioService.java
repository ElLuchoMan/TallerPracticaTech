package com.tallerback.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tallerback.entity.TipoUsuario;
import com.tallerback.repositories.TipoUsuarioRepository;

@Service
public class TipoUsuarioService{

	@Autowired
	TipoUsuarioRepository tipoUsuarioRepository;

	public List<TipoUsuario> findAllTipoUsuario() {
		// TODO Auto-generated method stub
		return tipoUsuarioRepository.findAll();
	}

	public Optional<TipoUsuario> findTipoUsuarioById(Long id) {
		// TODO Auto-generated method stub
		Optional<TipoUsuario> tipoUsuario = tipoUsuarioRepository.findById(id);
		return tipoUsuario;
	}

	public TipoUsuario saveTipoUsuario(TipoUsuario nuevoUsuario) {
		// TODO Auto-generated method stub
		if(nuevoUsuario != null) {
			return tipoUsuarioRepository.save(nuevoUsuario);
		}
		return new TipoUsuario();
	}

	public String deleteTipoUsuario(Long id) {
		// TODO Auto-generated method stub
		if(tipoUsuarioRepository.findById(id).isPresent()) {
			tipoUsuarioRepository.deleteById(id);
			return "Tipo de Usuario borrado correctamente";
		}
		return "Error, el Tipo de Usuario no existe!";
	}

	public TipoUsuario updateTipoUsuario(TipoUsuario tipoUsuario) {
		// TODO Auto-generated method stub
		Long num = tipoUsuario.getId_Tipo();
		if(tipoUsuarioRepository.findById(num).isPresent()) {
			TipoUsuario tipoUsuarioParaActualizar = new TipoUsuario();
			tipoUsuarioParaActualizar.setId_Tipo(tipoUsuario.getId_Tipo());
			tipoUsuarioParaActualizar.setDescripcion(tipoUsuario.getDescripcion());
			tipoUsuarioRepository.save(tipoUsuarioParaActualizar);
			return tipoUsuarioRepository.getById(num);
		}
		return null;
	}
	
	
}