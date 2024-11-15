package P2Observer;

public class Main {
    public static void main(String[] args) {
        // Crear la aplicación de mensajería
        AplicacionMensajeria notificaciones = new AplicacionMensajeria();

        Dispositivo dispositivo1 = new Dispositivo("Dispositivo 1");
        notificaciones.agregarObservador(dispositivo1);
        notificaciones.recibirMensaje("Notificación nueva");

    }
}

