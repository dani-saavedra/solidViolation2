package modelo;

public abstract class Carro {
    private String precio;
    public String getPrecio() {
        return precio;
    }
    public Carro(String precio) {
        this.precio = precio;
    }

    abstract public void mostrarPuertas();

    public void tanquiar(){
        System.out.println("Tanquiar con Gasolina");
    }
}
