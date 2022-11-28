package cl.generation.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generation.web.models.TipoEspecialidad;
import cl.generation.web.repositories.TipoEspecialidadRepository;

@Service
public class TipoEspecialidadServiceImpl implements TipoEspecialidadService {
// Logica de negocio del sistema web
	@Autowired
	private TipoEspecialidadRepository tipoEspecialidadRepository;

	@Override
	public TipoEspecialidad guardarTipoEspecialidad(TipoEspecialidad tipoEspecialidad) {

		return tipoEspecialidadRepository.save(tipoEspecialidad);
	}

	@Override
	public String eliminarTipoEspecialidad(Long id) {
		Boolean existe = tipoEspecialidadRepository.existsById(id);

		if (existe) {
			// elimino el usuario pasando el id (pk)
			tipoEspecialidadRepository.deleteById(id);
		} else {
			return "Tipo Especialidad no existe en la tabla";
		}

		existe = tipoEspecialidadRepository.existsById(id);

		// si es distinto de nulo, no fue eliminado
		if (existe) {
			return "Tipo Especialidad no eliminado";
		}

		return "El Tipo Especialidad fue eliminado";
	}

	@Override
	public String actualizarTipoEspecialidad(TipoEspecialidad tipoEspecialidad) {

		Boolean existe = tipoEspecialidadRepository.existsById(tipoEspecialidad.getId());

		if (existe) {
			tipoEspecialidadRepository.save(tipoEspecialidad);
			return "Tipo Especialidad actualizado";
		}
		return "Tipo Especialidad no actualizado";
	}

	@Override
	public TipoEspecialidad obtenerTipoEspecialidad(Long id) {
		// Optional<Usuario> user = usuarioRepository.findById(id);
		Boolean existe = tipoEspecialidadRepository.existsById(id);

		if (existe) {
			TipoEspecialidad user = tipoEspecialidadRepository.findById(id).get();
			return user;
		}
		return null;
	}

	// listar todos los usuarios
	@Override
	public List<TipoEspecialidad> obtenerListaTipoEspecialidades() {
		// obtener todos los usuarios
		return tipoEspecialidadRepository.findAll();
	}



}
