package cl.generation.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generation.web.models.AntecedentesM;
import cl.generation.web.models.GrupoSanguineo;
import cl.generation.web.repositories.AntecedentesMRepository;

@Service
public class AntecedentesMServiceImpl implements AntecedentesMService {
	@Autowired
	private AntecedentesMRepository antecedentesMRepositories;
	

	@Override
	public AntecedentesM guardarAntecendentesM(AntecedentesM antecedentesM) {
		// TODO Auto-generated method stub
		antecedentesMRepositories.save(antecedentesM);
		return null;
	}
	@Override
	public String eliminarAntecedentesM(Long id) {
		boolean existe = antecedentesMRepositories.existsById(id);
	if (existe) {
		antecedentesMRepositories.deleteById(id);
	}else {
		return "Antecedentes no encontrados";
	}
		return "Antecedentes eliminados correctamente";
		
	}
	@Override
	public String actualizarAntecedentesM(AntecedentesM antecedentesM) {
		boolean existe = antecedentesMRepositories.existsById(antecedentesM.getId());
		if (existe) {
			antecedentesMRepositories.save(antecedentesM);
			return "Antecedentes actualizados correctamente";
		}
			return "Antecedentes no actualizados";
	}
	@Override
	public AntecedentesM obtenerAntecedentesM(Long id) {
		boolean existe =antecedentesMRepositories.existsById(id);
		if (existe) {
			AntecedentesM antecedentesM = antecedentesMRepositories.findById(id).get();
			return antecedentesM;
		}
		return null;
	}
	@Override
	public List<AntecedentesM> obtenerListaAntecedentesM(){
		return antecedentesMRepositories.findAll();
		}
	
}

