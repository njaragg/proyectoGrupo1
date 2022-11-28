package cl.generation.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.generation.web.models.GrupoSanguineo;
import cl.generation.web.services.GrupoSanguineoServiceImpl;

@RestController
public class GrupoSanguineoApiRestController {
	@Autowired
	private GrupoSanguineoServiceImpl grupoSImpl;
	
	@RequestMapping("/guardar/gruposanguineo")
	public String guardarGrupoSanguineo(@RequestBody GrupoSanguineo gruposanguineo) {
		grupoSImpl.guardarGrupoSanguineo(gruposanguineo);
		return "";
	}
	
	//metodo eliminar
	@RequestMapping("/eliminar/gruposanguineo")
	public String eliminarGrupoSanguineo(@RequestParam(value ="id",required = false)Long id) {
		return grupoSImpl.eliminarGrupoSanguineo(id);
	}
	//metodo actualizar
	@RequestMapping("/actualizar/gruposanguineo")
	public String actualizarGrupoSanguineo(@RequestBody GrupoSanguineo gruposanguineo) {
		if(gruposanguineo.getId()!=null) {
			String mensaje = grupoSImpl.actualizarGrupoSanguineo(gruposanguineo);
			return "Grupo sanguineo actualizado correctamente";
		}
		return "No se actualizara el grupo sanguineo";


	}
	@RequestMapping("/obtener/gruposanguineo")
	public GrupoSanguineo obtenerGrupoSanguineo(@RequestParam(value="id",required = true )Long id ) {
		return grupoSImpl.obtenerGrupoSanguineo(id);
	}
	@GetMapping("/listar/gruposanguineo")
	public List<GrupoSanguineo> obtenerListaGrupoSanguineo(){
		return grupoSImpl.obtenerListaGrupoSanguineo();
		
	}
	
}
