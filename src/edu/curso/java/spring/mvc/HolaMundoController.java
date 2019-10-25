package edu.curso.java.spring.mvc;


import java.beans.PropertyEditorSupport;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/holamundo")
public class HolaMundoController {

	
	@RequestMapping(value = "/saludar", method = RequestMethod.GET)
	public String saludar(Model model)  {
	 	model.addAttribute("texto", "hola");
	 	return null;
	}

	@RequestMapping (value = "/sumar", method = RequestMethod.GET)
	public String sumar (Model model) {
	 	model.addAttribute("texto", "Sumar");
	 	model.addAttribute("num1", 1112);
	 	model.addAttribute("num2", 1112);
		return "/holamundo/sumar";
	}

	@RequestMapping (value = "/numeros", method = RequestMethod.GET)
	public String numeros (Model model) {
	 	model.addAttribute("texto", "Numeros");
	 	model.addAttribute("num1", 1112);
	 	model.addAttribute("num2", 1112);
		return "/holamundo/numeros";
	}
	
	@RequestMapping (value = "/numeros2/{num1}/{num2}", method = RequestMethod.GET)
	public String numeros2 (Model model, @PathVariable int num1, @PathVariable int num2) {
	 	model.addAttribute("texto", "Numeros2");
	 	model.addAttribute("num1", num1);
	 	model.addAttribute("num2", num2);
		return "/holamundo/numeros";
	}

	@RequestMapping (value = "/numeros3", method = RequestMethod.GET)
	public String numeros3 (Model model, @RequestParam int num1, @RequestParam int num2) {
	 	model.addAttribute("texto", "Numeros3");
	 	model.addAttribute("num1", num1);
	 	model.addAttribute("num2", num2);
		return "/holamundo/numeros";
	}
	
}



