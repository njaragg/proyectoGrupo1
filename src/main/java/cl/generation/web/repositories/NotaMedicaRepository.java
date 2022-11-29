package cl.generation.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.generation.web.models.NotaMedica;

@Repository
public interface NotaMedicaRepository extends JpaRepository<NotaMedica, Long>{

}
