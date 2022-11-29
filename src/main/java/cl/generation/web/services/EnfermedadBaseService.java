package cl.generation.web.services;

import java.util.List;
import java.util.Optional;

import cl.generation.web.models.EnfermedadBase;



public interface EnfermedadBaseService {

	public EnfermedadBase guardarEnfermedadBase(EnfermedadBase enfermedadbase);
	
	public String eliminarEnfermedadBase(Long id);
	
	public String actualizarEnfermedadBase(EnfermedadBase enfermedadbase);
	
	public EnfermedadBase obtenerEnfermedadBase(Long id);
	
    public Optional<EnfermedadBase> obtenerDatosEnfermedadBase(Long id);
	
	public List<EnfermedadBase> obtenerListaEnfermedadBase();

}
