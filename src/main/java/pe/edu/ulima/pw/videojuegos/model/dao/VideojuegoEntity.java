package pe.edu.ulima.pw.videojuegos.model.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "videojuegos")
public class VideojuegoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "descripcion", length = 200)
    private String descripcion;

    // [Videojuego] *--------------1 [Categoria]
    @ManyToOne
    private CategoriaEntity categoria;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<ConsolaEntity> consolas;

    public VideojuegoEntity() {}

    public VideojuegoEntity(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public VideojuegoEntity(Long id, String nombre, String descripcion, CategoriaEntity categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }

    public List<ConsolaEntity> getConsolas() {
        return consolas;
    }

    public void setConsolas(List<ConsolaEntity> consolas) {
        this.consolas = consolas;
    }
}
