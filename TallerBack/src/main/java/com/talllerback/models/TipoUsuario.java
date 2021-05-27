package com.talllerback.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_USUARIO")

public class TipoUsuario {
	@Id
	@Column(name="ID_TIPO", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Tipo;
	
	@Column(name = "DESCRIPCION", nullable = false)
	private String descripcion;
	
	@OneToMany(mappedBy="tipoUsuario")
	Set<Persona> usuarios;

		
	public TipoUsuario() {
		super();
	}

	public int getId_Tipo() {
		return id_Tipo;
	}

	public void setId_Tipo(int id_Tipo) {
		this.id_Tipo = id_Tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Persona> getUsuarios() {
		return usuarios;
	}
	
	
}
