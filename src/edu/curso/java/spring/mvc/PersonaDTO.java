package edu.curso.java.spring.mvc;

public class PersonaDTO {

	private Long id;
	private String nombre;

	public PersonaDTO() {

	}

	public PersonaDTO(String nombre, Long id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
