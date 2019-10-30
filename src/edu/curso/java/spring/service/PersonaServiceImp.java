package edu.curso.java.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.curso.java.spring.dao.PersonaDAO;
import edu.curso.java.spring.dto.PersonaDTO;

@Service
@Transactional(rollbackFor = Exception.class)
public class PersonaServiceImp implements PersonaService {

	@Autowired
	PersonaDAO personaDAO;

	@Override
	public void insertarPersona(PersonaDTO persona) {
		personaDAO.insertarPersona(persona);
	}

	@Override
	public void modificarDomicilioPersona(PersonaDTO persona) {
		personaDAO.modificarDomicilioPersona(persona);
	}

	@Override
	public void eliminarPersona(PersonaDTO persona) {
		personaDAO.eliminarPersona(persona);
	}

	@Override
	public List<PersonaDTO> listarPersonas() {
		return personaDAO.buscarPersonas();
	}

}
