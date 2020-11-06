package pe.edu.ulima.pw.videojuegos.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.ulima.pw.videojuegos.model.dao.CategoriaEntity;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {
}
