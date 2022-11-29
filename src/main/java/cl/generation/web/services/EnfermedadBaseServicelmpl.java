package cl.generation.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.generation.web.models.EnfermedadBase;
import cl.generation.web.repositories.EnfermedadBaseRepository;

@Service
public class EnfermedadBaseServicelmpl implements EnfermedadBaseService {
	@Autowired
	private EnfermedadBaseRepository enfermedadBaseRepository;

	@Override
	public EnfermedadBase guardarEnfermedadBase(EnfermedadBase enfermedadBase) {

		return enfermedadBaseRepository.save(enfermedadBase);

	}
	@Override
	public String eliminarEnfermedadBase(Long id) {
	Boolean existe = enfermedadBaseRepository.existsById(id);
		
		if(existe) {
			//elimino el usuario pasando el id (pk)
			enfermedadBaseRepository.deleteById(id);
		}else {
			return "USUARIO NO EXISTE EN LA TABLA";
		}
		
		existe = enfermedadBaseRepository.existsById(id);
		
		//si es distinto de nulo, no fue eliminado
		if(existe) {
			return "Enfermedad base no eliminado";
		}
		
		return "La enfermedad base  fue eliminado";
	}
	@Override
	public String actualizarEnfermedadBase(EnfermedadBase enfermedadbase) {

		Boolean existe = enfermedadBaseRepository.existsById(enfermedadbase.getId());
		
		if(existe) {
			enfermedadBaseRepository.save(enfermedadbase);
			return "Enfermedad base actualizada";
		}
		return "Enfermedad base no actualizado";
}
	@Override
	public EnfermedadBase obtenerEnfermedadBase(Long id) {
		//Optional<Usuario> user = usuarioRepository.findById(id);
		Boolean existe = enfermedadBaseRepository.existsById(id);
		
		if(existe) {
		EnfermedadBase enfermedadB= enfermedadBaseRepository.findById(id).get();
			return enfermedadB;
		}
		return null;
}	
	@Override
	public List<EnfermedadBase> obtenerListaEnfermedadBase() {
		// obtener todos los usuarios
		return enfermedadBaseRepository.findAll();
	}

	@Override
	public Optional<EnfermedadBase> obtenerDatosEnfermedadBase(Long id) {
		Optional<EnfermedadBase> mensaje = enfermedadBaseRepository.findById(id);
		return mensaje;
	}
	
}