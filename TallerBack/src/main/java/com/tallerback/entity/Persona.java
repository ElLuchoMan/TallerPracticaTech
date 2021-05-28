package com.tallerback.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="persona", schema="tallertech")
public class Persona {
		
	@Id
	@Column(name="IDENTIFICACION", nullable = false)
	private String Identificacion;
	
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
	private String numero_celular;
	
	@Column(name="PASSWORD", length=50, nullable=false)
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "ID_TIPO", nullable = false)
	private TipoUsuario tipoUsuario;

	public Persona() {
		super();
	}

	public String getIdentificacion() {
		return Identificacion;
	}

	public void setIdentificacion(String identificacion) {
		Identificacion = identificacion;
	}

	public String getPrimer_nombre() {
		return primer_nombre;
	}

	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}

	public String getSegundo_nombre() {
		return segundo_nombre;
	}

	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumero_celular() {
		return numero_celular;
	}

	public void setNumero_celular(String numero_celular) {
		this.numero_celular = numero_celular;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}	
	
}