package cl.generation.web.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.generation.web.models.LugarAtencion;
import cl.generation.web.services.LugarAtencionServiceImpl;

@RestController
public class LugarAtencionApiRestController {
	@Autowired
	private LugarAtencionServiceImpl lugarAtencionServiceImpl;

	@RequestMapping("/guardar/lugarAtencion")
	public LugarAtencion guardarLugarAtencion(@RequestBody LugarAtencion lugarAtencion) {
		// http://localhost:8080/guardar/lugarAtencion
/*
* { 
* "modalidad":"Presencial",
* "lugar":"Hospital San Borja Arriarán",
* "lugaresId":"1"
* }
*/
		return lugarAtencionServiceImpl.guardarLugarAtencion(lugarAtencion);
	}
	@RequestMapping("/eliminar/lugarAtencion")
	public String eliminarLugarAtencion(@RequestParam(value = "id", required = false) Long id) {

		return lugarAtencionServiceImpl.eliminarLugarAtencion(id);
	}

	 //crud actualizar
	@RequestMapping("/actualizar/lugarAtencion")
	public String lugarAtencion(@RequestBody LugarAtencion lugarAtencion) {
		if (lugarAtencion.getId() != null) {
			String mensaje = lugarAtencionServiceImpl.actualizarLugarAtencion(lugarAtencion);
			return mensaje;
		}
		return "No se actualizara ningun antecedente";
	}

	// Obtener
	@RequestMapping("/obtener/lugarAtencion")
	public LugarAtencion lugarAtencion(@RequestParam(value = "id", required = true) Long id) {
		return lugarAtencionServiceImpl.obtenerLugarAtencion(id);
	}

	// Listar
	@GetMapping("/listar/lugarAtencion")
	public List<LugarAtencion> obtenerListaLugarAtencion() {
		return lugarAtencionServiceImpl.obtenerListaLugaresAtencion();

}
}