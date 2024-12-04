package main.java.com.sinensia.proyecto1.plataforma;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Serie extends Media{

    static final Logger logger = Logger.getLogger(Serie.class.getName());

    protected int numeroCapitulos;
    protected List<Capitulos> capitulos = new ArrayList<>();

    /**
     * 
     * @param id
     * @param nombre
     * @param numeroCapitulos
     */
    public Serie(int id, String nombre, int numeroCapitulos){
        super(id, nombre);
        this.numeroCapitulos = numeroCapitulos;
    }

    @Override
    public void tipoMedia(){
        logger.info("Soy una serie.");
    }

    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    public void setNumeroCapitulos(int numeroCapitulos) {
        this.numeroCapitulos = numeroCapitulos;
    }

    public List<Capitulos> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(List<Capitulos> capitulos) {
        this.capitulos = capitulos;
    }

}
