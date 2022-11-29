package cl.generation.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.generation.web.models.FichaMedica;


@Repository
public interface FichaMedicaRepository extends JpaRepository<FichaMedica, Long>{

}
