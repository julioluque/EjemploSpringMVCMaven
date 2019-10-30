package edu.curso.java.spring.bo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Producto {

	private Long id;
	private Double precio;
	private String nombre;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
