package cl.generation.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
	
import cl.generation.web.models.Imagen;
import cl.generation.web.services.ImagenServiceImpl;

@RestController
public class ImagenApiRestController {
	@Autowired
	private ImagenServiceImpl imagenServiceImpl;
	
	//			Imagen imagen
	@RequestMapping("/guardar/imagen")
	//	http://localhost:8080/guardar/imagen
	public Imagen guardarImagen(@RequestBody Imagen imagen) {	
		return imagenServiceImpl.guardarImagen(imagen); //"Usuario guardado";
	}
	
	@RequestMapping("/eliminar/imagen")
	public String eliminarImagen(@RequestParam(value="id",required = false) Long id) {

		return imagenServiceImpl.eliminarImagen(id);
	}
	
	
	@RequestMapping("/actualizar/imagen")
	public String actualizarImagen(@RequestBody Imagen imagen) {
		if(imagen.getId()!=null) { // validamos si el id viene en el body
			return imagenServiceImpl.actualizarImagen(imagen);
		}
		return "No se actualizara ningun usuario, falta id"; //"Usuario guardado";
	}
	
					//	Imagen imagen
	@RequestMapping("/obtener/imagen")
	public Imagen obtenerImagen(@RequestParam(value="id",required = true) Long id) {
		//usuarioServicesImpl.eliminarUsuarioPorId(id);
		
		//CORREGIR EL CASO EN QUE EL ID NO EXISTA!!!!
		
		return imagenServiceImpl.obtenerImagen(id);
	}
	
	@GetMapping("/listar/imagenes")
	public List<Imagen> obtenerListaUsuarios(){
		return imagenServiceImpl.obtenerListaImagenes();
		
		
	}
	
	

}
