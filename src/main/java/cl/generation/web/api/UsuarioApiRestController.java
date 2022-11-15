package cl.generation.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.generation.web.models.Usuario;
import cl.generation.web.services.UsuarioServiceImpl;

@RestController
public class UsuarioApiRestController {
	@Autowired
	private UsuarioServiceImpl usuarioImpl;
	
	@RequestMapping("/guardar/usuario")
	public String guardarUsuario(@RequestBody Usuario usuario) {
	
		usuarioImpl.guardarUsuario(usuario);
		return ""; //esto es para capturar valores de la api
	}
}
