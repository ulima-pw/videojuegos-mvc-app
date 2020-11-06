package pe.edu.ulima.pw.videojuegos.model.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class CategoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    // [Videojuego] *--------------1 [Categoria]
    @OneToMany(mappedBy = "categoria" )
    private List<VideojuegoEntity> videojuegos;

    public CategoriaEntity(Long id, String nombre) {
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
