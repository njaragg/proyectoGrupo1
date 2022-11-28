package cl.generation.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.generation.web.models.TipoEspecialidad;
import cl.generation.web.services.TipoEspecialidadServiceImpl;

@RestController
public class TipoEspecialidadApiRestController {
	@Autowired
	private TipoEspecialidadServiceImpl tipoEspecialidadServiceImpl;

	@RequestMapping("/guardar/tipoEspecialidad")
	public TipoEspecialidad guardarTipoEspecialidad(@RequestBody TipoEspecialidad tipoEspecialidad) {
		// http://localhost:8080/guardar/tipoEspecialidad
		/*
		 * { "nombreEspecialidad":"kinesiologo", "tipo":"tobillo" }
		 */
		return tipoEspecialidadServiceImpl.guardarTipoEspecialidad(tipoEspecialidad);// "TipoEspecialidad guardado";
	}
	@RequestMapping("/eliminar/tipoEspecialidad")
	public String eliminarTipoEspecialidad(@RequestParam(value="id",required = false) Long id) {
		//llamando el metodo eliminar en el service
		/*String respuesta = usuarioServiceImpl.eliminarUsuario(id);
		return respuesta;*/
		return tipoEspecialidadServiceImpl.eliminarTipoEspecialidad(id);
	}

	@RequestMapping("/actualizar/tipoEspecialidad")
	public String actualizarTipoEspecialidad(@RequestBody TipoEspecialidad tipoEspecialidad) {
		//validacion logica
		if(tipoEspecialidad.getId()!=null) {
			String mensaje =  tipoEspecialidadServiceImpl.actualizarTipoEspecialidad(tipoEspecialidad);
			return mensaje;
		}
		return "No se actualizara ningun tipo Especialidad";
	}
	
	@RequestMapping("/obtener/tipoEspecialidad")
	public TipoEspecialidad obtenerTipoEspecialidad(@RequestParam(value="id",required = true) Long id) {
		
		return tipoEspecialidadServiceImpl.obtenerTipoEspecialidad(id);
	}
	
		
	//listar todos los usuarios
	@GetMapping("/listar/tipoEspecialidad")
	public List<TipoEspecialidad> obtenerListaTipoEspecialidades(){
		return tipoEspecialidadServiceImpl.obtenerListaTipoEspecialidades();
	}
}
