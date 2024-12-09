package main.java.com.sinensia.proyecto2.patrones.builder;

/**
 * Director
 */
public class Cocina {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) { pizzaBuilder = pb; }
    public Pizza getPizza() { return pizzaBuilder.getPizza(); }

    public void construirPizza() {
        pizzaBuilder.buildMasa();
        pizzaBuilder.buildSalsa();
        pizzaBuilder.buildRelleno();
    }

}
