package edu.curso.java.spring.mvc;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/holamundo")
public class HolaMundoRestController {

	@RequestMapping (value = "/saludar", method = RequestMethod.GET)
	public ResponseEntity<PersonaDTO> recuperarPersona(){
		PersonaDTO personaDTO = new PersonaDTO("Julio", 10L);
		return ResponseEntity.ok(personaDTO);
	}
}
