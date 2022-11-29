package cl.generation.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generation.web.models.Medicamento;
import cl.generation.web.repositories.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {
	@Autowired
	private MedicamentoRepository medicamentoRepository;

	@Override
	public Medicamento guardarMedicamento(Medicamento medicamento) {
		return medicamentoRepository.save(medicamento);
	}

	@Override
	public String eliminarMedicamento(Long id) {
		Boolean existe = medicamentoRepository.existsById(id);

		if (existe) {
			// elimino el usuario pasando el id (pk)
			medicamentoRepository.deleteById(id);
		} else {
			return "Medicamento NO EXISTE EN LA TABLA";
		}

		existe = medicamentoRepository.existsById(id);

		// si es distinto de nulo, no fue eliminado
		if (existe) {
			return "Medicamento no eliminado";
		}

		return "El Medicamento fue eliminado";
	}

	@Override
	public String actualizarMedicamento(Medicamento medicamento) {
		Boolean existe = medicamentoRepository.existsById(medicamento.getId());

		if (existe) {
			medicamentoRepository.save(medicamento);
			return "Medicamento actualizado con exito!";
		} else {

			return "Medicamento no existe, no se actualizo";
		}
	}

	@Override
	public Medicamento obtenerMedicamento(Long id) {
		Boolean existe = medicamentoRepository.existsById(id); // validar el registro en base de datos
		if (existe) {
			Medicamento medicamento = medicamentoRepository.findById(id).get();
			return medicamento;
		}
		else {
			return null;
		}
	}

	@Override
	public List<Medicamento> obtenerListaMedicamentos() {
		return medicamentoRepository.findAll();
	}

}
