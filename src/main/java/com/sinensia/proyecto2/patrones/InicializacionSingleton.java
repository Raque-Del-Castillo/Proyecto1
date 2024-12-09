package main.java.com.sinensia.proyecto2.patrones;

/**
 * Ejemplo inicializacion correcta patron singleton.
 */
public class InicializacionSingleton {

    private static InicializacionSingleton INSTANCE = null;

    private InicializacionSingleton(){ }

    /**
     * Es sincronizado para marcar que solo se lance uno detras de otro
     * (Para protegerse de problemas multi-hilo) --> Sistema monoatomico
     * Si if --> instancia el singleton en INSTANCE
     */
    private static synchronized void createInstance(){
        if(INSTANCE == null){
            INSTANCE = new InicializacionSingleton();
        }
    }

    /**
     * Inicializacion diferida (lazy)
     * @return el singleto INSTANCE
     */
    public static InicializacionSingleton getInstance(){
        if(INSTANCE == null) createInstance();
        return INSTANCE;
    }

    /**
     * Solo se accede a la zona sincronizada cuando la instancia no esta creada
     * Metodo aleternativo de createInstance optimizado
     */
    private static void optimizedCreateInstance(){
        if(INSTANCE == null){
            synchronized(InicializacionSingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new InicializacionSingleton();
                }
            }
        }
    }

}
