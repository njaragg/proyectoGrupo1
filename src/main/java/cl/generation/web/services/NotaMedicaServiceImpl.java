package cl.generation.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generation.web.models.NotaMedica;
import cl.generation.web.repositories.NotaMedicaRepository;
@Service
public class NotaMedicaServiceImpl implements NotaMedicaService {

	@Autowired
	private NotaMedicaRepository notaMedicaRepository;
	@Override
	public NotaMedica guardarNotaMedica(NotaMedica notaMedica) {
		
		return notaMedicaRepository.save(notaMedica);
	
	}
	@Override
	public String eliminarNotaMedica(Long id) {
	Boolean existe = notaMedicaRepository.existsById(id);
		
		if(existe) {
			//elimino el usuario pasando el id (pk)
			notaMedicaRepository.deleteById(id);
		}else {
			return "USUARIO NO EXISTE EN LA TABLA";
		}
		
		existe = notaMedicaRepository.existsById(id);
		
		//si es distinto de nulo, no fue eliminado
		if(existe) {
			return "nota medica no eliminado";
		}
		
		return "La nota medica fue eliminado";
	}
	@Override
	public String actualizarNotaMedica(NotaMedica notaMedica) {

		Boolean existe = notaMedicaRepository.existsById(notaMedica.getId());
		
		if(existe) {
			notaMedicaRepository.save(notaMedica);
			return "Nota Medica actualizada";
		}
		return "Nota Medica no actualizado";
}
	@Override
	public NotaMedica obtenerNotaMedica(Long id) {
		//Optional<Usuario> user = usuarioRepository.findById(id);
		Boolean existe = notaMedicaRepository.existsById(id);
		
		if(existe) {
		NotaMedica notaM= notaMedicaRepository.findById(id).get();
			return notaM;
		}
		return null;
 }
	@Override
	public List<NotaMedica> obtenerListaNotaMedica() {
		// obtener todos los usuarios
		return notaMedicaRepository.findAll();
	}

	@Override
	public Optional<NotaMedica> obtenerDatosNotaMedica(Long id) {
		Optional<NotaMedica> mensaje = notaMedicaRepository.findById(id);
		return mensaje;
	}

}	