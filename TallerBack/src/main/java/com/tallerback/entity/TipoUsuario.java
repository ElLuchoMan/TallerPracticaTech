package com.tallerback.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "tipousuario", schema="tallertech")

public class TipoUsuario {
	@Id
	@Column(name="ID_TIPO", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tipo;
	
	@Column(name = "DESCRIPCION", nullable = false)
	private String descripcion;
	
	@JsonIgnore
	@OneToMany(mappedBy="tipoUsuario")
	Set<Persona> usuarios;


	public Long getId_Tipo() {
		return id_tipo;
	}

	public void setId_Tipo(Long id_tipo) {
		this.id_tipo = id_tipo;
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
	
	public void setDescription(Set<Persona> usuarios) {
		this.usuarios = usuarios;
	}
}
