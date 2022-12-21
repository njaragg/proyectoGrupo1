package cl.generation.web.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.generation.web.models.NotaMedica;
import cl.generation.web.services.NotaMedicaServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class NotaMedicaApiRestController {

	@Autowired
	private NotaMedicaServiceImpl notaMedicaServiceImpl;
	
	@RequestMapping("/guardar/notamedica")
	public NotaMedica guardarNotaMedica(@RequestBody NotaMedica notaMedica) {
		
		return notaMedicaServiceImpl.guardarNotaMedica(notaMedica);
	}
	@RequestMapping("/eliminar/notamedica")
	public String eliminarNotaMedica(@RequestParam (value="id",required = false)Long id) {
		
		
		
		return notaMedicaServiceImpl.eliminarNotaMedica(id);
	}
	@RequestMapping("/actualizar/notamedica")
	public String actualizarNotaMedica(@RequestBody NotaMedica notaMedica) {
		//Validation logica
		if(notaMedica.getId()!=null) {
			String mensaje =  notaMedicaServiceImpl.actualizarNotaMedica(notaMedica);
			return mensaje;
			
		}
		return "No se actualizara Nota Medica";
	
}
	@RequestMapping("/obtenerdato/notamedica")
	public Optional<NotaMedica> obtenerDatosNotaMedica(@RequestParam(value = "id", required = true) Long id) {
			
		return notaMedicaServiceImpl.obtenerDatosNotaMedica(id);
 }
	@GetMapping("/listar/notamedica")
	public List<NotaMedica> obtenerListaNotaMedica(){
		return notaMedicaServiceImpl.obtenerListaNotaMedica();
		
	}
}