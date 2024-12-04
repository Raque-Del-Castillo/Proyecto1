package main.java.com.sinensia.proyecto1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import main.java.com.sinensia.proyecto1.plataforma.Capitulos;
import main.java.com.sinensia.proyecto1.plataforma.Pelicula;
import main.java.com.sinensia.proyecto1.plataforma.Serie;

public class App {
    static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {

        /*
        *  El envio para este primer programa es el que se encuentra en el folder plataforma,
        *  el folder restaurante es una prueba.
        */

        List<Capitulos> capitulos = new ArrayList<>();

        Serie juegoDeTronos = new Serie(1, "Juego de Tronos", 45);
        logger.info(juegoDeTronos.getNombre());
        //No he usado nunca loggers pero en el ejemplo de las constantes se usa de forma parecida
        logger.info(String.valueOf(juegoDeTronos.getId()));
        juegoDeTronos.tipoMedia();

        Pelicula origen = new Pelicula(45, "Origen", 70);
        logger.info(origen.getNombre());
        //No he usado nunca loggers pero en el ejemplo de las constantes se usa de forma parecida
        logger.info(String.valueOf(origen.getId()));
        origen.tipoMedia();

        capitulos.add(new Capitulos(32, "Dracarys", "Desenlace temporada 4")) ;
        capitulos.add(new Capitulos(14, "Vientos del Norte", "Desenlace temporada 2"));
        capitulos.add(new Capitulos(21, "La Batalla", "Desenlace temporada 3"));

        juegoDeTronos.setCapitulos(capitulos);

        try {
            for(int i = 0; i < 4; i++){
                logger.info(capitulos.get(i).getNombre());
            }
        } catch (IndexOutOfBoundsException e){
            logger.info("No hay mas datos almacenados.");
        } catch (Exception e) {
            logger.info("Error inesperado.");
        }
        
        

    }
}