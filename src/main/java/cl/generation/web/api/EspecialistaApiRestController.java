package cl.generation.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.generation.web.models.Especialista;
import cl.generation.web.models.GrupoSanguineo;
import cl.generation.web.services.EspecialistaServicesImpl;

@RestController
public class EspecialistaApiRestController {
	
	@Autowired
	private EspecialistaServicesImpl especialistaImpl;
	
	@RequestMapping("/guardar/especialista")
	public String guardarEspecialista(@RequestBody Especialista especialista) {
		especialistaImpl.guardarEspecialista(especialista);
		return "";
	}
	//metodo eliminar
		@RequestMapping("/eliminar/especialista")
		public String eliminarEspecialista(@RequestParam(value ="id",required = false)Long id) {
			return especialistaImpl.eliminarEspecialista(id);
		}
	
	//metodo actualizar
		@RequestMapping("/actualizar/especialista")
		public String actualizarEspecialista(@RequestBody Especialista especialista) {
			if(especialista.getId()!=null) {
				String mensaje = especialistaImpl.actualizarEspecialista(especialista);
				return "Especialista actualizado correctamente";
			}
			return "Especialista no actualizado";

		}
	//metodo obtener
		@RequestMapping("/obtener/especialista")
		public Especialista obtenerEspecialista(@RequestParam(value="id",required = true )Long id ) {
			return especialistaImpl.obtenerEspecialista(id);
		}
	//metodo Lista	
		@GetMapping("/listar/especialista")
		public List<Especialista> obtenerListaEspecialista(){
			return especialistaImpl.obtenerListaEspecialista();
			
		}

}
