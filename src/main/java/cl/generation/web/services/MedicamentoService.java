package cl.generation.web.services;

import java.util.List;
import cl.generation.web.models.Medicamento;


public interface MedicamentoService {

	public Medicamento guardarMedicamento(Medicamento medicamento);
	public String eliminarMedicamento(Long id);
	public String actualizarMedicamento(Medicamento medicamento);
	public Medicamento obtenerMedicamento(Long id);
	public List<Medicamento> obtenerListaMedicamentos();
}
