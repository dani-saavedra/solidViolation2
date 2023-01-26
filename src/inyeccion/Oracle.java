package inyeccion;

public class Oracle implements GuardaDb, GuardarPuertaDB {

    @Override
    public void guardarCarro() {
        System.out.println("Guardo en oracle");
    }

    @Override
    public void crearPuerta() {

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
