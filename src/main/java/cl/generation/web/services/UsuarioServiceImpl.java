package cl.generation.web.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generation.web.models.Usuario;
import cl.generation.web.repositories.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService {
// Logica de negocio del sistema web
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Boolean guardarUsuario(Usuario usuario) {
		
		//validar el usuario (email)
		Usuario retornoUsuario = usuarioRepository.findByCorreo(usuario.getCorreo());

		if(retornoUsuario == null) {
			//1234 -> $1231245321425fas4352
			String passHashed = BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt());
			//reemplazando el valor por el hash
			usuario.setPassword(passHashed);		
			
			usuarioRepository.save(usuario);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String eliminarUsuario(Long id) {
		Boolean existe = usuarioRepository.existsById(id);
		
		if(existe) {
			usuarioRepository.deleteById(id);
		}else {
			return "Usuario no existe en la tabla";
		}
		
		existe = usuarioRepository.existsById(id);
		
		if(existe) {
			return "Usuario no eliminado";
		}
		
		return "El usuario fue eliminado";
	}
	@Override
	public String actualizarUsuario(Usuario usuario) {
		Boolean existe = usuarioRepository.existsById(usuario.getId());
		if (existe) {
			usuarioRepository.save(usuario);
			return "Usuario actualizado";
		}
		return "Usuario no actualizado";
	}
	
	public Usuario obtenerUsuario(Long id) {
		Boolean existe =usuarioRepository.existsById(id);
		
		if(existe) {
			Usuario especialist = usuarioRepository.findById(id).get();
			return especialist;
		}
			return null;
	}
	@Override
	public List<Usuario> obtenerListaUsuarios() {
		return usuarioRepository.findAll();
	}
	
	@Override
	public Boolean ingresoUsuario(String correo, String password) {
		System.out.println(correo +" "+password);
		Usuario usuario = usuarioRepository.findByCorreo(correo);
		if(usuario!= null) {//existe el usuario
			//return BCrypt.checkpw(password,usuario.getPassword());

			//comparar contraseñas
			boolean resultadoPwd = BCrypt.checkpw(password,usuario.getPassword());

			if(resultadoPwd) {//resultadoPwd == true; son iguales-> 
				return true;
			}else {//resultadoPwd == false; password distintas
				return false;
			}

		}else {//no existe el email en bd
			return false;
		}
	}


}



