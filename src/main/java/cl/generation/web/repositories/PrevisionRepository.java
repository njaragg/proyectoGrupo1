package cl.generation.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.generation.web.models.Prevision;

@Repository
public interface PrevisionRepository extends JpaRepository<Prevision, Long>{

}
