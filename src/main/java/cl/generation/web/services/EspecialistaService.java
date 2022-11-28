package cl.generation.web.services;

import java.util.List;

import cl.generation.web.models.Especialista;
import cl.generation.web.models.GrupoSanguineo;

public interface EspecialistaService {
	
	public Especialista guardarEspecialista(Especialista especialista);
	public String eliminarEspecialista(Long id);
	public String actualizarEspecialista(Especialista especialista);
	public Especialista obtenerEspecialista(Long id);
	public List<Especialista> obtenerListaEspecialista();

}
