package cl.generation.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generation.web.models.LugarAtencion;
import cl.generation.web.models.Prevision;
import cl.generation.web.models.Usuario;
import cl.generation.web.repositories.LugarAtencionRepository;

@Service
public class LugarAtencionServiceImpl implements LugarAtencionService {
	// realizamos la lógica de negocio del sistema web

	@Autowired
	private LugarAtencionRepository lugarAtencionRepository;

	@Override
	public LugarAtencion guardarLugarAtencion(LugarAtencion lugarAtencion) {

		return lugarAtencionRepository.save(lugarAtencion);
	}

	// eliminar
	@Override
	public String eliminarLugarAtencion(Long id) {
		Boolean existe = lugarAtencionRepository.existsById(id);

		if (existe) {
			lugarAtencionRepository.deleteById(id);
		} else {
			return "El lugar de atención no existe en la tabla";
		}

		existe = lugarAtencionRepository.existsById(id);

		if (existe) {
			return "Lugar no eliminado";
		}

		return "El lugar fue eliminado";
	}

	// actualizar

	@Override
	public String actualizarLugarAtencion(LugarAtencion lugarAtencion) {
		Boolean existe = lugarAtencionRepository.existsById(lugarAtencion.getId());
		if (existe) {
			lugarAtencionRepository.save(lugarAtencion);
			return "Lugar actualizado";
		}
		return "Lugar no actualizado";
	}

	// obtener
	@Override
	public LugarAtencion obtenerLugarAtencion(Long id) {
		Boolean existe =lugarAtencionRepository.existsById(id);
		if(existe) {
			LugarAtencion place = lugarAtencionRepository.findById(id).get();
			return place;
		}
		return null;
	}

//Lista
	@Override
	public List<LugarAtencion> obtenerListaLugaresAtencion() {
		return lugarAtencionRepository.findAll();
	}

}
