package main.java.com.sinensia.proyecto2.patrones.builder;

class CarbonaraPizzaBuilder extends PizzaBuilder{

    public CarbonaraPizzaBuilder(){ super.pizza = new Pizza(); }

    public void buildMasa() { pizza.setMasa("tostada"); }
    public void buildSalsa() { pizza.setSalsa("cremosa"); }
    public void buildRelleno() { pizza.setRelleno("jamon+champinon");}

}
