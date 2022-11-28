package cl.generation.web.services;

import java.util.List;

import cl.generation.web.models.TipoEspecialidad;

public interface TipoEspecialidadService {
	public TipoEspecialidad guardarTipoEspecialidad(TipoEspecialidad tipoEspecialidad);

	public String eliminarTipoEspecialidad(Long id);

	public String actualizarTipoEspecialidad(TipoEspecialidad tipoEspecialidad);

	public TipoEspecialidad obtenerTipoEspecialidad(Long id);

	public List<TipoEspecialidad> obtenerListaTipoEspecialidades();

}
