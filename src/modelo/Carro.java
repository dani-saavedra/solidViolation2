package modelo;

public class Carro {

    public String marca;
    public String color;

    public Carro(String marca) {
        this.marca = marca;
    }

    String getMarcaCoche() {
        return marca;
    }

    void guardarCocheDB(Carro carro) {
        System.out.println("Guarde en BD");
    }
}
