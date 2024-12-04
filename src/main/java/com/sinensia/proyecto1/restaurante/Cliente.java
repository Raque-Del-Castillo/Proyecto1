package main.java.com.sinensia.proyecto1.restaurante;

public class Cliente extends Persona {

    protected int numeroCliente;

    public Cliente(String nombre, int edad, int telefono, int numeroCliente){
        super(nombre, edad, telefono);
        this.numeroCliente = numeroCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }


}
