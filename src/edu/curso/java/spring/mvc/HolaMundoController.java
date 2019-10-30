	
package edu.curso.java.spring.mvc;
 
 
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
@RequestMapping(value = "/holamundo")
public class HolaMundoController {
 
     
    @RequestMapping(value = "/saludar", method = RequestMethod.GET)
    public String saludar(Model model)  {
        model.addAttribute("texto", "hola");
        return "/holamundo/saludar";
    }
 
    @RequestMapping(value = "/numeros", method = RequestMethod.GET)
    public String numeros(Model model)  {
        model.addAttribute("num1", 10);
        model.addAttribute("num2", 20);
        return "/holamundo/numeros";
    }
 
    //   /holamundo/numeros2/10/34.html
    @RequestMapping(value = "/numeros2/{num1}/{num2}", method = RequestMethod.GET)
    public String numeros2(Model model, @PathVariable int num1, @PathVariable int num2)  {
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "/holamundo/numeros";
    }
 
 
    //   /holamundo/numeros2.html?num1=43&num2=123
    @RequestMapping(value = "/numeros3", method = RequestMethod.GET)
    public String numeros3(Model model, @RequestParam int num1, @RequestParam int num2)  {
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "/holamundo/numeros";
    }
 
 
    @RequestMapping(value = "/mostrarform", method = RequestMethod.GET)
    public String mostrarform(Model model)  {
        model.addAttribute("formCalculadora", new FormCalculadora());
 
        return "/holamundo/numeros";
    }
 
     
     
    @RequestMapping(value = "/numeros4", method = RequestMethod.POST)
    public String numeros4(Model model, @ModelAttribute("formCalculadora") @Valid FormCalculadora formCalculadora, 
            BindingResult result)  {
        Integer total = 0;
 
        if(!result.hasErrors()) {
            if(formCalculadora.getOperacion().equals("sumar")) {
                total = formCalculadora.getNum1() + formCalculadora.getNum2();
            } else if(formCalculadora.getOperacion().equals("restar")) {
                total = formCalculadora.getNum1() - formCalculadora.getNum2();              
            }           
        }
 
        model.addAttribute("total", total);
        model.addAttribute("formCalculadora", formCalculadora);
        return "/holamundo/numeros";
    }
 
     
    /*
     
    @RequestMapping(value = "/numeros4", method = RequestMethod.POST)
    public String numeros4(Model model, @RequestParam int num1, @RequestParam int num2, 
            @RequestParam String operacion)  {
         
        if(operacion.equals("sumar")) {
             
        } else if(operacion.equals("restar")) {
             
        }
         
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "/holamundo/numeros";
    } */
 
     
     
     
 
}
