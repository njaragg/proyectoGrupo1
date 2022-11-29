package cl.generation.web.services;

import java.util.List;
import java.util.Optional;

import cl.generation.web.models.NotaMedica;


public interface NotaMedicaService {
	public NotaMedica guardarNotaMedica(NotaMedica notamedica);

	public String eliminarNotaMedica(Long id);
	
	public String actualizarNotaMedica(NotaMedica notamedica);
	
	public NotaMedica obtenerNotaMedica(Long id);
	
	public Optional<NotaMedica> obtenerDatosNotaMedica(Long id);
	
	public List<NotaMedica> obtenerListaNotaMedica();



}

