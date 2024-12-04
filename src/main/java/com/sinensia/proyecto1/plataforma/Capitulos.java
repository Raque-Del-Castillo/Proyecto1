package main.java.com.sinensia.proyecto1.plataforma;

public class Capitulos {

    protected int id;
    protected String nombre;
    protected String descripcion;

    /**
     * 
     * @param id 
     * @param nombre
     * @param descripcion
     */
    public Capitulos(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

}
