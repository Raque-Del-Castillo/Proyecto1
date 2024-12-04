package main.java.com.sinensia.proyecto1.restaurante;

import java.util.logging.Logger;

public abstract class Persona {

    static final Logger logger = Logger.getLogger(Persona.class.getName());

    private String nombre;
    private int edad;
    private int telefono;

    protected Persona(String nombre, int edad, int telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad<18){
            logger.info("Los menores no pueden registrarse sin consentimiento de un adulto.");
        } else {
            this.edad = edad;
        }
        
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
