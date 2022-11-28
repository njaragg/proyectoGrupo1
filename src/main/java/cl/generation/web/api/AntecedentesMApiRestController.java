package cl.generation.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.generation.web.models.AntecedentesM;
import cl.generation.web.models.Especialista;
import cl.generation.web.services.AntecedentesMServiceImpl;

@RestController
public class AntecedentesMApiRestController {

	@Autowired
	private AntecedentesMServiceImpl  antecedentesMImpl;

	@RequestMapping("/guardar/antecedentesM")
	public String guardarAntecedentesM(@RequestBody AntecedentesM antecedentesM) {
		
		antecedentesMImpl.guardarAntecendentesM(antecedentesM);
		return "";
	}
	//metodo eliminar
			@RequestMapping("/eliminar/antecedentesM")
			public String eliminarAntecedentesM(@RequestParam(value ="id",required = false)Long id) {
				return antecedentesMImpl.eliminarAntecedentesM(id);
			}
		
		//metodo actualizar
			@RequestMapping("/actualizar/antecedentesM")
			public String actualizarAntecedentesM(@RequestBody AntecedentesM antecedentesM) {
				if(antecedentesM.getId()!=null) {
					String mensaje = antecedentesMImpl.actualizarAntecedentesM(antecedentesM);
					return "Antecedentes actualizados correctamente";
				}
				return "Antecedentes no actualizados";


			}
		//metodo obtener
			@RequestMapping("/obtener/antecedentesM")
			public AntecedentesM obtenerAntecedentesM(@RequestParam(value="id",required = true )Long id ) {
				return antecedentesMImpl.obtenerAntecedentesM(id);
			}
		//metodo Lista	
			@GetMapping("/listar/antecedentesM")
			public List<AntecedentesM> obtenerListaAntecedentesM(){
				return antecedentesMImpl.obtenerListaAntecedentesM();
				
			}




}
