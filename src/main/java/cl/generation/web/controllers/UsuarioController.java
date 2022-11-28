package cl.generation.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	//https://localhost:8080/
	@RequestMapping("/")  //capturamos las rutas
	public String getUsuario () {
		System.out.println("Obtener usuario");
		return "index.jsp";
		
	}
}
