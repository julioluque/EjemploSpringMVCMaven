package edu.curso.java.spring.mvc;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.curso.java.spring.dto.PersonaDTO;

@RestController
@RequestMapping("/api/holamundo")
public class HolaMundoRestController {

	@RequestMapping(value = "/saludar", method = RequestMethod.GET)
	public ResponseEntity<PersonaDTO> recuperarPersona(@RequestBody PersonaDTO personaDTO) {
		return ResponseEntity.ok(personaDTO);
	}

}
