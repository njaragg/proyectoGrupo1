package cl.generation.web.services;

import java.util.List;



import cl.generation.web.models.FichaMedica;


public interface FichaMedicaService {

	public FichaMedica guardarFichaMedica(FichaMedica fichaMedica);
	public String eliminarFichaMedica(Long id);
	public String actualizarFichaMedica(FichaMedica fichaMedica);
	public FichaMedica obtenerFichaMedica(Long id);
	public List<FichaMedica> obtenerListaFichasMedicas();
}
