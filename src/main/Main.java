package main;

import modelo.Audi;
import modelo.Carro;
import modelo.Renault;
import modelo.Twingo;

public class Main {
    public static void main(String[] args) {
        Carro[] arrayCoches = {
                new Renault(),
                new Audi(),
        };
        imprimirPrecioMedioCoche(arrayCoches);
    }

    public static void imprimirPrecioMedioCoche(Carro[] carros) {
        for (Carro carro : carros) {
            System.out.println(carro.getPrecio());
            // Instace OF sirve para decir si una clase es de un tipo
            carro.mostrarPuertas();
            carro.tanquiar();
        }
    }
}
