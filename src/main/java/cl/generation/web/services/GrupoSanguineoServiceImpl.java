package cl.generation.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generation.web.models.GrupoSanguineo;
import cl.generation.web.repositories.GrupoSanguineoRepository;

@Service
public class GrupoSanguineoServiceImpl implements GrupoSanguineoService {
	@Autowired
	private GrupoSanguineoRepository gruposanguineorepositories;
	
	public GrupoSanguineo guardarGrupoSanguineo(GrupoSanguineo gruposanguineo) {
		gruposanguineorepositories.save(gruposanguineo);
		return null;
	}
	@Override
	public String eliminarGrupoSanguineo(Long id) {
		boolean existe = gruposanguineorepositories.existsById(id);
	if (existe) {
		gruposanguineorepositories.deleteById(id);
	}else {
		return "Grupo sanguineo no encontrado";
	}
		return "Grupo sanguineo eliminado";
		
	}
	@Override
	public String actualizarGrupoSanguineo(GrupoSanguineo gruposanguineo) {
		boolean existe = gruposanguineorepositories.existsById(gruposanguineo.getId());
		if (existe) {
			gruposanguineorepositories.save(gruposanguineo);
			return "Grupo sanguineo actualizado";
		}
			return "Grupo sanguineo no actualizado";
	}
	
	@Override
	public GrupoSanguineo obtenerGrupoSanguineo(Long id) {
		boolean existe =gruposanguineorepositories.existsById(id);
		if (existe) {
			GrupoSanguineo gruposanguineo = gruposanguineorepositories.findById(id).get();
			return gruposanguineo;
		}
		return null;
	}
	@Override
	public List<GrupoSanguineo> obtenerListaGrupoSanguineo(){
		return gruposanguineorepositories.findAll();
		}
}
