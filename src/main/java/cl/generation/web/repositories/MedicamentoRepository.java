package cl.generation.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.generation.web.models.Medicamento;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Long>{

}
