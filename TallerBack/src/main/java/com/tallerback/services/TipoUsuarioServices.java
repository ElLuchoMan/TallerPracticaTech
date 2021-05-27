package com.tallerback.services;

import java.util.List;
import java.util.Optional;

import com.talllerback.models.TipoUsuario;

public interface TipoUsuarioServices {
	
	public List<TipoUsuario> findAllTipoUsuario();
	
	public Optional<TipoUsuario> findTipoUsuarioById(Long id);
	
	public TipoUsuario saveTipoUsuario(TipoUsuario nuevoUsuario);
	
	public String deleteTipoUsuario(Long id);
	
	public TipoUsuario updateTipoUsuario(TipoUsuario usuarioParaActualizar);
}
