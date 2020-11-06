package pe.edu.ulima.pw.videojuegos.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.ulima.pw.videojuegos.model.dao.VideojuegoEntity;

public interface VideojuegoRepository extends JpaRepository<VideojuegoEntity, Long> {
}
