package main.java.com.sinensia.proyecto2.patrones.builder;

/**
 * Abstract Builder.
 */
abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() { return pizza; }

    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();

}
