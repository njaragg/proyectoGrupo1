package cl.generation.web.services;

import java.util.List;

import cl.generation.web.models.LugarAtencion;


public interface LugarAtencionService {
	// definir métodos para crud usuario
	public LugarAtencion guardarLugarAtencion(LugarAtencion lugarAtencion);
	public String eliminarLugarAtencion(Long id);
	public String actualizarLugarAtencion(LugarAtencion lugarAtencion);
	public LugarAtencion obtenerLugarAtencion(Long id);
	public List<LugarAtencion> obtenerListaLugaresAtencion();
	
}