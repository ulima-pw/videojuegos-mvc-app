package pe.edu.ulima.pw.videojuegos.model.dao;

import pe.edu.ulima.pw.videojuegos.model.repositories.ConsolaRepository;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "consolas")
public class ConsolaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 100)
    private String nombre;

    @ManyToMany(mappedBy = "consolas")
    private List<VideojuegoEntity> videojuegos;

    public ConsolaEntity() {}

    public ConsolaEntity(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<VideojuegoEntity> getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(List<VideojuegoEntity> videojuegos) {
        this.videojuegos = videojuegos;
    }
}
