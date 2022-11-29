package cl.generation.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generation.web.models.Imagen;

import cl.generation.web.repositories.ImagenRepository;

@Service
public class ImagenServiceImpl implements ImagenService {
	@Autowired
	private ImagenRepository imagenRepository;

	@Override
	public Imagen guardarImagen(Imagen imagen) {
		return imagenRepository.save(imagen);
	}

	@Override
	public String eliminarImagen(Long id) {
		Boolean existe = imagenRepository.existsById(id);

		if (existe) {
			// elimino el usuario pasando el id (pk)
			imagenRepository.deleteById(id);
		} else {
			return "Imagen no existe en la tabla";
		}

		existe = imagenRepository.existsById(id);

		// si es distinto de nulo, no fue eliminado
		if (existe) {
			return "Imagen no eliminada";
		}

		return "La imagen fue eliminada";
	}

	@Override
	public String actualizarImagen(Imagen imagen) {
		Boolean existe = imagenRepository.existsById(imagen.getId());

		if (existe) { 
			imagenRepository.save(imagen);
			return "Imagen actualizada con exito!";
		} else {

			return "Imagen no existe, no se actualizo";
		}
	}

	@Override
	public Imagen obtenerImagen(Long id) {
		Boolean existe = imagenRepository.existsById(id); // validar el registro en base de datos
		if (existe) {
			Imagen imagen = imagenRepository.findById(id).get();
			return imagen;
		}
		else {
			return null;
		}
	}

	@Override
	public List<Imagen> obtenerListaImagenes() {
		return imagenRepository.findAll();
	}

}
