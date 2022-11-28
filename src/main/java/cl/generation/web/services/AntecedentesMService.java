package cl.generation.web.services;

import java.util.List;

import cl.generation.web.models.AntecedentesM;


public interface AntecedentesMService {
	
	public AntecedentesM guardarAntecendentesM(AntecedentesM antecedentesM);
	public String eliminarAntecedentesM(Long id);
	public String actualizarAntecedentesM(AntecedentesM antecedentesM);
	public AntecedentesM obtenerAntecedentesM(Long id);
	public List<AntecedentesM> obtenerListaAntecedentesM();
}
