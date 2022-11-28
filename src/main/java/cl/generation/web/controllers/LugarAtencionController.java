package cl.generation.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lugarAtencion")
public class LugarAtencionController {

	@RequestMapping("/") // 
	public String getLugarAtencion() {
		System.out.println("Obtener lugar de Atención");
		return "index.jsp";

	}
}