package pe.edu.ulima.pw.videojuegos.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.ulima.pw.videojuegos.model.dao.ConsolaEntity;

//CRUD : 
public interface ConsolaRepository extends JpaRepository<ConsolaEntity, Long> {
}
