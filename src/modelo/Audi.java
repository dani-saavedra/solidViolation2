package modelo;

public class Audi extends Carro {
    public Audi() {
        super("25000");
    }
    public void mostrarPuertas(){
        System.out.println("2 puertas");
    }

    @Override
    public void tanquiar() {
        System.out.println("Me cargo es con Electricidad");
    }
}
