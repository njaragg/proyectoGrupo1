package cl.generation.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.generation.web.services.UsuarioServiceImpl;


@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;

	//Despliegue jsp
	@GetMapping("/usuario")
	public String mostrarFormulario() {
		//desplegar el jsp (controlador)
		return "login.jsp";
	}
	//http://localhost:8080/login/usuario

	//captura 
	@PostMapping("/admin")
	public String ingresoUsuario(@RequestParam("correo") String correo,
			@RequestParam ("password") String password,
			Model model) {
		//System.out.println(email +" "+pass);
		//llamando al metodo
		Boolean resultadoLogin = usuarioServiceImpl.ingresoUsuario(correo,password);

		if(resultadoLogin) {//resultadoLogin == true, login correcto
			//ir a una ruta interna http://localhost:8080/home
			return "redirect:http://localhost:3000/";
		}else {
			model.addAttribute("msgError", "Por favor verifica tus datos ingresados");
			return "login.jsp";
		}
	}

	
	}
	