package pe.edu.ulima.pw.videojuegos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.edu.ulima.pw.videojuegos.forms.GuardarVideojuegoForm;
import pe.edu.ulima.pw.videojuegos.model.dao.CategoriaEntity;
import pe.edu.ulima.pw.videojuegos.model.dao.ConsolaEntity;
import pe.edu.ulima.pw.videojuegos.model.dao.VideojuegoEntity;
import pe.edu.ulima.pw.videojuegos.model.repositories.CategoriaRepository;
import pe.edu.ulima.pw.videojuegos.model.repositories.ConsolaRepository;
import pe.edu.ulima.pw.videojuegos.model.repositories.VideojuegoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class VideojuegosController {

    @Autowired
    private VideojuegoRepository vjRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ConsolaRepository consolaRepository;

    @RequestMapping(value = "/videojuegos/listar", method = RequestMethod.GET)
    public String mostrarListadoVideojuegos(Model model) {
        List<VideojuegoEntity> videojuegos = vjRepository.findAll();

        model.addAttribute("listaVideojuegos", videojuegos);
        return "videojuegos";
    }

    @RequestMapping(value = "/videojuegos/editar", method = RequestMethod.GET)
    public String mostrarEdicionVideojuego(Model model) {
        List<CategoriaEntity> categorias = categoriaRepository.findAll();
        model.addAttribute("categorias", categorias);
        return "videojuegos_edit";
    }

    @RequestMapping(value = "/videojuegos/guardar", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String guardarVideojuego(GuardarVideojuegoForm form) {
        // Guardar el videojuego en la base de datos


        VideojuegoEntity vj = new VideojuegoEntity();
        vj.setNombre(form.getVideojuego_nombre());

        // Obtner una categoria de la bd con el id que esta en el form
        Long idCategoria = Long.parseLong(form.getVideojuego_categoria());
        Optional<CategoriaEntity> opCategoria = categoriaRepository.findById(idCategoria);
        if (opCategoria.isPresent()) {
            vj.setCategoria(opCategoria.get());
            vjRepository.save(vj);
        }

        // ps5,switch -> [ps5, switch]

        String consolas = form.getVideojuego_consolas();
        String[] partesConsolas = consolas.split(",");
        List<ConsolaEntity> listaConsolas = new ArrayList<>();

        for (String con : partesConsolas) {
            ConsolaEntity consola = consolaRepository.findByNombre(con);
            if (consola != null) {
                listaConsolas.add(consola);
            }
        }

        vj.setConsolas(listaConsolas);
        vjRepository.save(vj);
        return "redirect:/videojuegos/listar";

    }

    @RequestMapping(value = "/videojuegos/modificar/{id}", method = RequestMethod.GET)
    public String mostrarModificarVideojuego(
            Model model,
            @PathVariable String id) {

        Optional<VideojuegoEntity> opVj = vjRepository.findById(Long.parseLong(id));

        if (opVj.isPresent()){
            model.addAttribute("videojuego", opVj.get());
        }

        List<CategoriaEntity> categorias = categoriaRepository.findAll();
        model.addAttribute("categorias", categorias);
        return "videojuegos_edit";
    }

}
