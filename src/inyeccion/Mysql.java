package inyeccion;

public class Mysql implements GuardaDb {
    public void guardarCarro() {
        System.out.println("Guardar Carro en MYSQL");
    }

    @Override
    public void guardarPasajero() {

    }

    @Override
    public void actualizarPasajero() {

    }

    @Override
    public void sacarPasajero() {

    }

}
