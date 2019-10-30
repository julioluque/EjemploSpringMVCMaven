package edu.curso.java.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.curso.java.spring.bo.Producto;
import edu.curso.java.spring.dto.PersonaDTO;

@Repository
public class PersonaDAOImp implements PersonaDAO {

	//@Autowired
	SessionFactory sessionFactory;

	@Override
	public void insertarPersona(PersonaDTO persona) {
		sessionFactory.getCurrentSession().save(persona);
	}

	@Override
	public void modificarDomicilioPersona(PersonaDTO persona) {
		Query consulta = sessionFactory.getCurrentSession().createQuery("from PersonaDTO where nombre = '"
				+ persona.getNombre() + "' and apellido = '" + persona.getApellido() + "'");
		persona = (PersonaDTO) consulta.uniqueResult();
		sessionFactory.getCurrentSession().update(persona);
	}

	@Override
	public void eliminarPersona(PersonaDTO persona) {
		Query consulta = sessionFactory.getCurrentSession().createQuery("from PersonaDTO where nombre = '"
				+ persona.getNombre() + "' and apellido = '" + persona.getApellido() + "'");
		persona = (PersonaDTO) consulta.uniqueResult();
		sessionFactory.getCurrentSession().delete(persona);
	}

	@Override
	public List<PersonaDTO> buscarPersonas() {
		Query consulta = sessionFactory.getCurrentSession().createQuery("from PersonaDTO");
		return consulta.list();
	}

	@Override
	public PersonaDTO obtenerPersonaPorId(int id) {
		return (PersonaDTO) sessionFactory.getCurrentSession().load(PersonaDTO.class, id);
	}

}
