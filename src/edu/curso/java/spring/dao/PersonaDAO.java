package edu.curso.java.spring.dao;

import java.util.List;

import edu.curso.java.spring.dto.PersonaDTO;

public interface PersonaDAO {

	public void insertarPersona(PersonaDTO persona);

	public void modificarDomicilioPersona(PersonaDTO persona);

	public void eliminarPersona(PersonaDTO persona);

	public List<PersonaDTO> buscarPersonas();

	public PersonaDTO obtenerPersonaPorId(int id);

}
