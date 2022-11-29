package cl.generation.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generation.web.models.FichaMedica;
import cl.generation.web.repositories.FichaMedicaRepository;

@Service
public class FichaMedicaServiceImpl implements FichaMedicaService {
	@Autowired
	private FichaMedicaRepository fichaMedicaRepository;

	@Override
	public FichaMedica guardarFichaMedica(FichaMedica fichaMedica) {
		return fichaMedicaRepository.save(fichaMedica);
	}

	@Override
	public String eliminarFichaMedica(Long id) {
		Boolean existe = fichaMedicaRepository.existsById(id);

		if (existe) {
			// elimino el usuario pasando el id (pk)
			fichaMedicaRepository.deleteById(id);
		} else {
			return "FICHA MEDICA NO EXISTE EN LA TABLA";
		}

		existe = fichaMedicaRepository.existsById(id);

		// si es distinto de nulo, no fue eliminado
		if (existe) {
			return "Ficha medica no eliminado";
		}

		return "La Ficha medica fue eliminado";
	}

	@Override
	public String actualizarFichaMedica(FichaMedica fichaMedica) {
		Boolean existe = fichaMedicaRepository.existsById(fichaMedica.getId());

		if (existe) { 
			fichaMedicaRepository.save(fichaMedica);
			return "Ficha medica actualizado con exito!";
		} else {

			return "Ficha medica no existe, no se actualizo";
		}
	}

	@Override
	public FichaMedica obtenerFichaMedica(Long id) {
		Boolean existe = fichaMedicaRepository.existsById(id); // validar el registro en base de datos
		if (existe) {
			FichaMedica ficha = fichaMedicaRepository.findById(id).get();
			return ficha;
		}
		else {
			return null;
		}
	}

	@Override
	public List<FichaMedica> obtenerListaFichasMedicas() {
		return fichaMedicaRepository.findAll();
	}

}
