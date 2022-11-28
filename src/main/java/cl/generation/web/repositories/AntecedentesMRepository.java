package cl.generation.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.generation.web.models.AntecedentesM;

@Repository
public interface AntecedentesMRepository extends JpaRepository<AntecedentesM, Long>{ 
}


