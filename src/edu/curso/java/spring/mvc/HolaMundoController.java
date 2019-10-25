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



}



