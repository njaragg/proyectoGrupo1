package cl.generation.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.generation.web.models.EnfermedadBase;


@Repository
public interface EnfermedadBaseRepository extends JpaRepository<EnfermedadBase, Long> {

}
