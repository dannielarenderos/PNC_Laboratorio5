package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="ESTUDIANTE")
public class Estudiante{
	
	@Id
	@Column(name="c_usuario")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer c_usuario;
	
	@Size(message="El nombre no debe tener mas de 30 caracteres", max=50)
	@NotEmpty(message="No puede estar vacio")
	@Column(name="Nombre")
	private String Nombre;
	
	@Size(message="El nombre no debe tener mas de 30 caracteres", max=50)
	@NotEmpty(message="No puede estar vacio")
	@Column(name="Apellido")
	private String Apellido;
	
	@Size(message="El carne no debe tener mas de 15 caracteres", max=10)
	@NotEmpty(message="No puede estar vacio")
	@Column(name="Carne")
	private String Carne;
	
	@Size(message="El carrera no debe tener mas de 15 caracteres", max=100)
	@NotEmpty(message="No puede estar vacio")
	@Column(name="Carrera")
	private String Carrera;
	
	
	
	public Estudiante(String nombre,String apellido,String carne,String carrera) {
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Carne = carne;
		this.Carrera = carrera;
	}

	public Estudiante() {

	}
	
	
	public Integer getC_usuario() {
		return c_usuario;
	}

	public void setC_usuario(Integer c_usuario) {
		this.c_usuario = c_usuario;
	}

	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getCarne() {
		return Carne;
	}

	public void setCarne(String carne) {
		Carne = carne;
	}

	public String getCarrera() {
		return Carrera;
	}

	public void setCarrera(String carrera) {
		Carrera = carrera;
	}
	
	

	
	
	
}
	