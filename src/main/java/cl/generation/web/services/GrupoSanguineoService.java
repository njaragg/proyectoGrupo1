package cl.generation.web.services;

import java.util.List;

import cl.generation.web.models.GrupoSanguineo;

public interface GrupoSanguineoService {
	
	public GrupoSanguineo guardarGrupoSanguineo(GrupoSanguineo gruposanguineo);
	public String eliminarGrupoSanguineo(Long id);
	public String actualizarGrupoSanguineo(GrupoSanguineo gruposanguineo);
	public GrupoSanguineo obtenerGrupoSanguineo(Long id);
	public List<GrupoSanguineo> obtenerListaGrupoSanguineo();
}
