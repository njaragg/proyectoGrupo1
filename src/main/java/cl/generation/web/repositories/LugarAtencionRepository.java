package cl.generation.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.generation.web.models.LugarAtencion;

@Repository
public interface LugarAtencionRepository extends JpaRepository<LugarAtencion, Long>{

}
