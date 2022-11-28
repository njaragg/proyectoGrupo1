package cl.generation.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.generation.web.models.Especialista;

@Repository
public interface EspecialistaRepository extends JpaRepository<Especialista, Long> {

}
