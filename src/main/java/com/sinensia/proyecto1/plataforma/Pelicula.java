package main.java.com.sinensia.proyecto1.plataforma;

import java.util.logging.Logger;

public class Pelicula extends Media{

    static final Logger logger = Logger.getLogger(Pelicula.class.getName());

    protected int duracion;

    /**
     * 
     * @param id
     * @param nombre
     * @param duracion
     */
    public Pelicula(int id, String nombre, int duracion){
        super(id, nombre);
        this.duracion = duracion;
    }

    @Override
    public void tipoMedia(){
        logger.info("Soy una pelicula.");
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}