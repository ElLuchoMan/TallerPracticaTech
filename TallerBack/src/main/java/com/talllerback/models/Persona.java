package com.talllerback.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PERSONA")
@NoArgsConstructor @Data
public class Persona {
		
	@Id
	@Column(name="IDENTIFICACION", nullable = false)
	private int Identificacion;
	
	@Column(name="PRIMER_NOMBRE", length=30, nullable=false)
	private String primer_nombre;
	
	@Column(name="SEGUNDO_NOMBRE", length=30, nullable=false)
	private String segundo_nombre;
	
	@Column(name="PRIMER_APELLIDO", length=30, nullable=false)
	private String primer_apellido;
	
	@Column(name="SEGUNDO_APELLIDO", length=30, nullable=false)
	private String segundo_apellido;
	
	@Column(name="CORREO", length=200, nullable=false)
	private String correo;
	
	@Column(name="DIRECCION", length=200, nullable=false)
	private String direccion;
	
	@Column(name="NUMERO_CELULAR", nullable = false)
	private int numero_celular;
	
	@Column(name="PASSWORD", length=50, nullable=false)
	private String password;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_TIPO")
	private TipoUsuario tipoUsuario;
}