package main.java.com.sinensia.proyecto2.patrones.builder;

import java.util.logging.Logger;

/**
 * Cliente pide una pizza
 */
class BuilderExample {

    static final Logger logger = Logger.getLogger(BuilderExample.class.getName());

    public static void main(String[] args) {

        Cocina cocina = new Cocina();

        PizzaBuilder carbonaraPizzaBuilder = new CarbonaraPizzaBuilder();

        cocina.setPizzaBuilder(carbonaraPizzaBuilder);
        cocina.construirPizza();

        Pizza pizza = cocina.getPizza();

        logger.info(pizza.getMasa());
        logger.info(pizza.getSalsa());
        logger.info(pizza.getRelleno());

    }
}
