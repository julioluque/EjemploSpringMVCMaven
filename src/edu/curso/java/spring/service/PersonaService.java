package edu.curso.java.spring.service;

import java.util.List;

import edu.curso.java.spring.dto.PersonaDTO;

public interface PersonaService {
	
	public void insertarPersona(PersonaDTO persona);
	public void modificarDomicilioPersona(PersonaDTO persona);
	public void eliminarPersona(PersonaDTO persona);
	public List<PersonaDTO> listarPersonas();
	
	

}
