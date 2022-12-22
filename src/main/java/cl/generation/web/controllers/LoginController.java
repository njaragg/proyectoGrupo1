package cl.generation.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/login")
public class LoginController {
	

	@GetMapping("/usuario")
	public String mostrarFormulario() {
		//desplegar el jsp (controlador)
		return "login.jsp";
	}
	//http://localhost:8080/login/usuario

	}
	