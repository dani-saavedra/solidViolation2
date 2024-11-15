package P2Observer;

public class Dispositivo implements Observador {
    private String nombre;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Dispositivo " + nombre + " recibió el mensaje: " + mensaje);
    }
}

