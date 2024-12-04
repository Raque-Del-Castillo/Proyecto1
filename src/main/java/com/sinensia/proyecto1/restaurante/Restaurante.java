package main.java.com.sinensia.proyecto1.restaurante;

import java.util.logging.Logger;

/**
 *  Originalmente iba a hacer programa de cliente y restaurante, al final hemos ido con media
 *  y no he podido terminar aun 
 */

public class Restaurante {

    static final Logger logger = Logger.getLogger(Restaurante.class.getName());

    protected String nombre;
    protected String direccion;
    protected int telefono;

    protected Restaurante(String nombre, String direccion, int telefono){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {

        int length = String.valueOf(telefono).length();
        if(length < 9 || length > 9){
            logger.info("Introduzca un numero de telefono correcto.");
        } else {
            this.telefono = telefono;
        }
    }

    
}
