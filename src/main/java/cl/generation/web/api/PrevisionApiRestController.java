package cl.generation.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.generation.web.models.Prevision;
import cl.generation.web.models.Usuario;
import cl.generation.web.services.PrevisionServiceImpl;

@RestController
public class PrevisionApiRestController {
	@Autowired
	private PrevisionServiceImpl previsionServiceImpl;

	@RequestMapping("/guardar/prevision")
	public Prevision guardarPrevision(@RequestBody Prevision prevision) {
		// http://localhost:8080/guardar/prevision
/*
* { 
* "nombre":"Fonasa c"
* }
*/
		return previsionServiceImpl.guardarPrevision(prevision);// "Prevision guardada";
	}

	// Crud eliminar

@RequestMapping("/eliminar/prevision")
public String eliminarPrevision(@RequestParam(value="id",required = false) Long id) {

	return previsionServiceImpl.eliminarPrevision(id);
}

 //crud actualizar
@RequestMapping("/actualizar/prevision")
public String prevision(@RequestBody Prevision prevision) {
	if (prevision.getId() != null) {
		String mensaje = previsionServiceImpl.actualizarPrevision(prevision);
		return mensaje;
	}
	return "No se actualizó";
}

// Obtener
@RequestMapping("/obtener/prevision")
public Prevision obtenerPrevision(@RequestParam(value = "id", required = true) Long id) {
	return previsionServiceImpl.obtenerPrevision(id);
}

// Listar
@GetMapping("/listar/prevision")
public List<Prevision> obtenerListaPrevision() {
	return previsionServiceImpl.obtenerListaPrevisiones();

}
}
