package main;

import logica.CarroService;
import modelo.Carro;

public class Main {
    public static void main(String[] args) {
        Carro[] arrayCoches = {
                new Carro("Renault"),
                new Carro("Audi")
        };
        imprimirPrecioMedioCoche(arrayCoches);

        //Guardar carro en la BD.
        CarroService service = new CarroService();
        service.guardarCocheDB(new Carro("Renault"));

    }

    public static void imprimirPrecioMedioCoche(Carro[] carros) {
        for (Carro carro : carros) {
            if (carro.marca.equals("Renault")) {
                System.out.println(18000);
            }
            if (carro.marca.equals("Audi")) {
                System.out.println(25000);
            }
        }
    }
}
