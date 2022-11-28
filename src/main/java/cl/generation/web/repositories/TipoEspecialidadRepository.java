package cl.generation.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.generation.web.models.TipoEspecialidad;

@Repository
public interface TipoEspecialidadRepository extends JpaRepository<TipoEspecialidad, Long> {

}
