package cl.generation.web.services;

import java.util.List;
import java.util.Optional;

import cl.generation.web.models.Prevision;
import cl.generation.web.models.Prevision;

public interface PrevisionService {
	public Prevision guardarPrevision(Prevision prevision);
	public String eliminarPrevision(Long id);
	public String actualizarPrevision(Prevision prevision);
	public Prevision obtenerPrevision(Long id);
	public List<Prevision> obtenerListaPrevisiones();
	
}