package cl.generation.web.services;

import java.util.List;

import cl.generation.web.models.Imagen;

		// Imagen imagen
public interface ImagenService {
	public Imagen guardarImagen(Imagen imagen);
	public String eliminarImagen(Long id);
	public String actualizarImagen(Imagen imagen);
	public Imagen obtenerImagen(Long id);
	public List<Imagen> obtenerListaImagenes();

}
