package cl.generation.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generation.web.models.Especialista;

import cl.generation.web.repositories.EspecialistaRepository;

@Service
public class EspecialistaServicesImpl implements EspecialistaService {
	@Autowired
	private EspecialistaRepository especialistarepositories;
	
	@Override
	public Especialista  guardarEspecialista(Especialista especialista) {
	especialistarepositories.save(especialista);
	return null;
	}
	@Override
	public String eliminarEspecialista(Long id) {
		boolean existe = especialistarepositories.existsById(id);
	if (existe) {
		especialistarepositories.deleteById(id);
	}else {
		return "Especialista no encontrado";
	}
		return "Especialista eliminado";
	}
	@Override
	public String actualizarEspecialista(Especialista especialista) {
		boolean existe = especialistarepositories.existsById(especialista.getId());
		if (existe) {
			especialistarepositories.save(especialista);
			return "Especialista actualizado";
		}
			return "Especialista no actualizado";
	}
	@Override
	public Especialista obtenerEspecialista(Long id) {
		boolean existe =especialistarepositories.existsById(id);
		if (existe) {
			Especialista especialista = especialistarepositories.findById(id).get();
			return especialista;
		}
		return null;
	}
	@Override
	public List<Especialista> obtenerListaEspecialista(){
		return especialistarepositories.findAll();
		}
	
}

