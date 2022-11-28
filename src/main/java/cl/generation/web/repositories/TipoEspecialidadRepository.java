package cl.generation.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<<< HEAD:src/main/java/cl/generation/web/repositories/TipoEspecialidadRepository.java
import cl.generation.web.models.TipoEspecialidad;

@Repository
public interface TipoEspecialidadRepository extends JpaRepository<TipoEspecialidad, Long> {
========
import cl.generation.web.models.Prevision;

@Repository
public interface PrevisionRepository extends JpaRepository<Prevision, Long>{
>>>>>>>> faa5415786a8c184bf5a8d995d9fd94daa896e04:src/main/java/cl/generation/web/repositories/PrevisionRepository.java

}
