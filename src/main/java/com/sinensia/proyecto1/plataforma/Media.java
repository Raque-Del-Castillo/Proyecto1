package main.java.com.sinensia.proyecto1.plataforma;

public abstract class Media {

    protected int id;
    protected String nombre;
    
    /**
     * 
     * @param id
     * @param nombre
     */
    protected Media(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    public void tipoMedia() { }
    
}
