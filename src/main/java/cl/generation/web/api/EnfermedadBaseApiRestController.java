package cl.generation.web.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.generation.web.models.EnfermedadBase;
import cl.generation.web.services.EnfermedadBaseServicelmpl;

@RestController
public class EnfermedadBaseApiRestController {

	@Autowired
	private EnfermedadBaseServicelmpl enfermedadBaseServicelmpl;

	@RequestMapping("/guardar/enfermedadBase")
	public EnfermedadBase guardarEnfermedadBase(@RequestBody EnfermedadBase enfermedadBase) {

		return enfermedadBaseServicelmpl.guardarEnfermedadBase(enfermedadBase);

	}
	@RequestMapping("/eliminar/enfermedadBase")
	public String eliminarEnfermedadBase(@RequestParam (value="id",required = false)Long id) {
		
		return enfermedadBaseServicelmpl.eliminarEnfermedadBase(id);
 }

@RequestMapping("/actualizar/enfermedadBase")
public String actualizarEnfermedadBase(@RequestBody EnfermedadBase enfermedadBase) {
	
	if(enfermedadBase.getId()!=null) {
		String mensaje =  enfermedadBaseServicelmpl.actualizarEnfermedadBase(enfermedadBase);
		return mensaje;
		
	}
	return "No se actualizara Enfermedad base";

}
@RequestMapping("/obtenerdato/EnfermedadBase")
public Optional<EnfermedadBase> obtenerDatosEnfermedadBase(@RequestParam(value = "id", required = true) Long id) {
		
	return enfermedadBaseServicelmpl.obtenerDatosEnfermedadBase(id);
  }
@GetMapping("/listar/enfermedadBase")
public List<EnfermedadBase> obtenerListaEnfermedadBase(){
	return enfermedadBaseServicelmpl.obtenerListaEnfermedadBase();
}
}