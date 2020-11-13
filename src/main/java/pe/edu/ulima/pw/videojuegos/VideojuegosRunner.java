package pe.edu.ulima.pw.videojuegos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pe.edu.ulima.pw.videojuegos.model.dao.CategoriaEntity;
import pe.edu.ulima.pw.videojuegos.model.dao.ConsolaEntity;
import pe.edu.ulima.pw.videojuegos.model.dao.VideojuegoEntity;
import pe.edu.ulima.pw.videojuegos.model.repositories.CategoriaRepository;
import pe.edu.ulima.pw.videojuegos.model.repositories.ConsolaRepository;
import pe.edu.ulima.pw.videojuegos.model.repositories.VideojuegoRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class VideojuegosRunner implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ConsolaRepository consolaRepository;

    @Autowired
    private VideojuegoRepository vjRepository;

    @Override
    public void run(String... args) throws Exception {
        // Agregando categorias
        /*CategoriaEntity cat1 = new CategoriaEntity(null, "2D Platform");
        CategoriaEntity cat2 = new CategoriaEntity(null, "Speed run");
        CategoriaEntity cat3 = new CategoriaEntity(null, "Third Person");
        categoriaRepository.save(cat1);
        categoriaRepository.save(cat2);
        categoriaRepository.save(cat3);

        //Agregando consolas
        ConsolaEntity consola1 = new ConsolaEntity(null, "PS5");
        ConsolaEntity consola2 = new ConsolaEntity(null, "XBox Series");
        ConsolaEntity consola3 = new ConsolaEntity(null, "Switch");
        consolaRepository.save(consola1);
        consolaRepository.save(consola2);
        consolaRepository.save(consola3);

        // Agregar videojuegos
        VideojuegoEntity v1 = new VideojuegoEntity(
                null,
                "Spiderman Miles Morales",
                "bla bla",
                cat3
        );
        VideojuegoEntity v2 = new VideojuegoEntity(
                null,
                "Xenoblade",
                "bla",
                cat1
        );

        vjRepository.save(v1);
        vjRepository.save(v2);

        List<ConsolaEntity> consolasV1 = new ArrayList<>();
        consolasV1.add(consola1);

        List<ConsolaEntity> consolasV2 = new ArrayList<>();
        consolasV2.add(consola3);
        consolasV2.add(consola1);

        v1.setConsolas(consolasV1);
        v2.setConsolas(consolasV2);

        vjRepository.save(v1);
        vjRepository.save(v2);*/

    }
}
