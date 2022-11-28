package cl.generation.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import cl.generation.web.models.GrupoSanguineo;

@EnableJpaRepositories
public interface GrupoSanguineoRepository extends JpaRepository<GrupoSanguineo, Long> {

}
