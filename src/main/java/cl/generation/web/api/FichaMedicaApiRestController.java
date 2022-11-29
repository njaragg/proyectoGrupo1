package cl.generation.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.generation.web.models.FichaMedica;
import cl.generation.web.services.FichaMedicaServiceImpl;

@RestController
public class FichaMedicaApiRestController {
	
	@Autowired
	private FichaMedicaServiceImpl fichaMedicaServiceImpl;
	
	@RequestMapping("/guardar/fichamedica")
	//	http://localhost:8080/guardar/fichamedica
	public FichaMedica guardarFichaMedica(@RequestBody FichaMedica fichaMedica) {	
		return fichaMedicaServiceImpl.guardarFichaMedica(fichaMedica); //"Usuario guardado";
	}
	
	@RequestMapping("/eliminar/fichamedica")
	public String eliminarFichaMedicaPorId(@RequestParam(value="id",required = false) Long id) {

		return fichaMedicaServiceImpl.eliminarFichaMedica(id);
	}
	
	@RequestMapping("/actualizar/fichamedica")
	public String actualizarFichaMedica(@RequestBody FichaMedica fichaMedica) {
		if(fichaMedica.getId()!=null) { // validamos si el id viene en el body
			return fichaMedicaServiceImpl.actualizarFichaMedica(fichaMedica);
		}
		return "No se actualizara ningun usuario, falta id"; //"Usuario guardado";
	}
	
	@RequestMapping("/obtener/fichamedica")
	public FichaMedica obtenerFichaMedica(@RequestParam(value="id",required = true) Long id) {
		//usuarioServicesImpl.eliminarUsuarioPorId(id);
		
		//CORREGIR EL CASO EN QUE EL ID NO EXISTA!!!!
		
		return fichaMedicaServiceImpl.obtenerFichaMedica(id);
	}
	
	@GetMapping("/listar/fichasmedicas")
	public List<FichaMedica> obtenerListaUsuarios(){
		return fichaMedicaServiceImpl.obtenerListaFichasMedicas();
		
		
	}
	
	
	
}
