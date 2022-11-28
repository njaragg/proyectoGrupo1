package cl.generation.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generation.web.models.Prevision;
import cl.generation.web.models.Usuario;
import cl.generation.web.repositories.PrevisionRepository;

@Service
public class PrevisionServiceImpl implements PrevisionService{
 //realizamos la lógica de negocio del sistema web
	
	//guardar
	@Autowired
	private PrevisionRepository previsionRepository;
	
	@Override
	public Prevision guardarPrevision(Prevision prevision) {
		
		return previsionRepository.save(prevision);
		
	}
	
	//eliminar
	@Override
	public String eliminarPrevision(Long id) {
		Boolean existe = previsionRepository.existsById(id);
		
		if(existe) {
			previsionRepository.deleteById(id);
		}else {
			return "Usuario no existe en la tabla";
		}
		
		existe = previsionRepository.existsById(id);
		
		if(existe) {
			return "Prevision no eliminada";
		}
		
		return "La prevision fue eliminado";
	}
	
	//actualizar

	@Override
	public String actualizarPrevision(Prevision prevision) {

		Boolean existe = previsionRepository.existsById(prevision.getId());
		
		if(existe) {
			previsionRepository.save(prevision);
			return "Prevision actualizado";
		}
		return "Prevision no actualizado";
	}
	
 //obtener
	public Prevision obtenerPrevision(Long id) {
		Boolean existe =previsionRepository.existsById(id);
		
		if(existe) {
			Prevision prevision = previsionRepository.findById(id).get();
			return prevision;
		}
			return null;
	}
	
//Lista
	@Override
	public List<Prevision> obtenerListaPrevisiones() {
		// obtener todos los usuarios
		return previsionRepository.findAll();
	}
}
