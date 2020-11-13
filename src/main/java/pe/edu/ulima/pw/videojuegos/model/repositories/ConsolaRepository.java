package pe.edu.ulima.pw.videojuegos.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.ulima.pw.videojuegos.model.dao.ConsolaEntity;

//CRUD : 
public interface ConsolaRepository extends JpaRepository<ConsolaEntity, Long> {
    // SQL -> Structured Query Language
    // consulta JPQL -> JPA query Language
    @Query("SELECT c FROM ConsolaEntity c WHERE c.nombre=?1")
    ConsolaEntity findByNombre(String nombre);
}
