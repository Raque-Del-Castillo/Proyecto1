package main.java.com.sinensia.proyecto2.patrones.builder;

/**
 * Producto.
 */
public class Pizza {

    private String masa;
    private String salsa;
    private String relleno;

    public String getMasa() {
        return masa;
    }
    public String getSalsa() {
        return salsa;
    }
    public String getRelleno() {
        return relleno;
    }
    public void setMasa(String masa) { this.masa = masa; }
    public void setSalsa(String salsa) { this.salsa = salsa; }
    public void setRelleno(String relleno) {this.relleno = relleno; }
 
}
