package cl.generation.web.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.generation.web.models.Usuario;
import cl.generation.web.services.UsuarioServiceImpl;

@RestController
public class UsuarioApiRestController {
	@Autowired
	private UsuarioServiceImpl usuarioServiceImpl;

	@RequestMapping("/guardar/usuario")
	public String guardarUsuario(@RequestBody Usuario usuario) {
		// http://localhost:8080/guardar/usuario
		/*
		 * { "nombre":"cristi", "apellido":"Alvarado", "rut":"19934544-7",
		 * "telefono":"76543321", "fechaNac": "1998-02-25", "genero":"fem",
		 * "sexo":"fem", "correo":"a3456@a.cl", "prevision":"isapre",
		 * "password":"secret3" }
		 */
		Boolean resultado = usuarioServiceImpl.guardarUsuario(usuario);
		if(resultado) {//si es verdadero
			return "Insertado correctamente"; //enviar a una vista
		}else {
			return "Error la crear usuario";
		}
	}
	
	
	@RequestMapping("/eliminar/usuario")
	public String eliminarUsuario(@RequestParam(value = "id", required = false) Long id) {

		return usuarioServiceImpl.eliminarUsuario(id);
	}

	// Actualizar
	@RequestMapping("/actualizar/usuario")
	public String usuario(@RequestBody Usuario usuario) {
		if (usuario.getId() != null) {
			String mensaje = usuarioServiceImpl.actualizarUsuario(usuario);
			return mensaje;
		}
		return "No se actualizara ningun antecedente";
	}

	// Obtener
	@RequestMapping("/obtener/usuario")
	public Usuario obtenerUsuario(@RequestParam(value = "id", required = true) Long id) {
		return usuarioServiceImpl.obtenerUsuario(id);
	}

	// Listar
	@GetMapping("/listar/usuario")
	public List<Usuario> obtenerListaUsuario() {
		return usuarioServiceImpl.obtenerListaUsuarios();

	}

}
