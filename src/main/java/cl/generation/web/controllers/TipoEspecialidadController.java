package cl.generation.web.controllers;

<<<<<<< HEAD:src/main/java/cl/generation/web/controllers/TipoEspecialidadController.java
public class TipoEspecialidadController {
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
>>>>>>> faa5415786a8c184bf5a8d995d9fd94daa896e04:src/main/java/cl/generation/web/controllers/UsuarioController.java

	//https://localhost:8080/
	@RequestMapping("/")  //capturamos las rutas
	public String getUsuario () {
		System.out.println("Obtener usuario");
		return "index.jsp";
		
	}
}
