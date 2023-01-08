package cl.generation.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.generation.web.models.Usuario;
import cl.generation.web.services.UsuarioServiceImpl;

@Controller
@RequestMapping("")
public class RegisterController {
	
	@Autowired 
	UsuarioServiceImpl usuarioServiceImpl;
	
	//despliege Register
	@GetMapping("/register")
	public String registro() {
		
		return "Register.jsp";
	}
	

	@PostMapping("/register")
	public String guardarFormulario(@RequestParam("nombre") String nombre,
			@RequestParam("rut") String rut,
			@RequestParam("correo") String correo,
			
			@RequestParam("apellido") String apellido,
			@RequestParam("pass") String password,Model model) {
			
			
			//Instanciado de objeto usuario
		
			Usuario usuario = new Usuario();
			
			usuario.setNombre(nombre);
			usuario.setApellido(apellido);
			usuario.setRut(rut);
			usuario.setCorreo(correo);
			usuario.setTelefono(0);
			usuario.setPassword(password);
	
			//Posteo info en base de datos
			Boolean resultado = usuarioServiceImpl.guardarUsuario(usuario);
			if (resultado) {
				model.addAttribute("msgOK", "Registro exitoso");
			return "redirect:/login/usuario"; 
			
			}else {
				model.addAttribute("msgOK", "Usuario ya registrado");
				return "register.jsp"; 
			} 
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	}
	