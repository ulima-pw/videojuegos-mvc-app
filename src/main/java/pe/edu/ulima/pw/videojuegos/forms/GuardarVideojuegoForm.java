package pe.edu.ulima.pw.videojuegos.forms;

public class GuardarVideojuegoForm {
    private String videojuego_nombre;
    private String videojuego_categoria;
    private String videojuego_consolas;

    public GuardarVideojuegoForm() {
    }

    public String getVideojuego_nombre() {
        return videojuego_nombre;
    }

    public void setVideojuego_nombre(String videojuego_nombre) {
        this.videojuego_nombre = videojuego_nombre;
    }

    public String getVideojuego_categoria() {
        return videojuego_categoria;
    }

    public void setVideojuego_categoria(String videojuego_categoria) {
        this.videojuego_categoria = videojuego_categoria;
    }

    public String getVideojuego_consolas() {
        return videojuego_consolas;
    }

    public void setVideojuego_consolas(String videojuego_consolas) {
        this.videojuego_consolas = videojuego_consolas;
    }
}
