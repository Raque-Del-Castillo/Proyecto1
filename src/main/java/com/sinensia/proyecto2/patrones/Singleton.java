package main.java.com.sinensia.proyecto2.patrones;

/**
 * Codigo explicacion patron Singleton
 */
public class Singleton {

    /**
     * static: Existe desde el momento que la clase se carga en memoria (cuando se referencia)
     * final: Inamovible --> Constante (por eso en mayus)
     */
    private static final Singleton INSTANCE = new Singleton();

    /**
     * No se puede acceder directamente
     * Se pone privado para asegurar que no se crean varias instancias desde fuera
     */
    private Singleton(){ }

    /**
     * Singleton.getInstance()
     * @return el Singleton INSTANCE
     */
    public static Singleton getInstance(){
        return INSTANCE;
    }

}
