package inyeccion;

public class Servicio {
    private GuardaDb interfaz;
    public Servicio(GuardaDb interfaz) {
        this.interfaz = interfaz;
    }
    void metodo() {
        interfaz.guardarCarro();
    }
}
