package cl.generation.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.generation.web.models.Medicamento;
import cl.generation.web.services.MedicamentoServiceImpl;


@RestController
public class MedicamentoApiRestController {
	@Autowired
	private MedicamentoServiceImpl medicamentoServiceImpl;
	
	// Medicamento medicamento
	@RequestMapping("/guardar/medicamento")
	//	http://localhost:8080/guardar/medicamento
	public Medicamento guardarMedicamento(@RequestBody Medicamento medicamento) {	
		return medicamentoServiceImpl.guardarMedicamento(medicamento); //"Usuario guardado";
	}
	
	@RequestMapping("/eliminar/medicamento")
	public String eliminarMedicamento(@RequestParam(value="id",required = false) Long id) {

		return medicamentoServiceImpl.eliminarMedicamento(id);
	}
	
	@RequestMapping("/actualizar/medicamento")
	public String actualizarMedicamento(@RequestBody Medicamento medicamento) {
		if(medicamento.getId()!=null) { // validamos si el id viene en el body
			return medicamentoServiceImpl.actualizarMedicamento(medicamento);
		}
		return "No se actualizara ningun usuario, falta id"; //"Usuario guardado";
	}
	
	@RequestMapping("/obtener/medicamento")
	public Medicamento obtenerMedicamento(@RequestParam(value="id",required = true) Long id) {
		//usuarioServicesImpl.eliminarUsuarioPorId(id);
		
		//CORREGIR EL CASO EN QUE EL ID NO EXISTA!!!!
		
		return medicamentoServiceImpl.obtenerMedicamento(id);
	}
	
	@GetMapping("/listar/medicamentos")
	public List<Medicamento> obtenerListaUsuarios(){
		return medicamentoServiceImpl.obtenerListaMedicamentos();
	}
	
	
	
}

