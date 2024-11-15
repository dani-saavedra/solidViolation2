package P2Observer;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMensajeria implements Sujeto {
    private List<Observador> dispositivos;
    private String mensaje;

    public AplicacionMensajeria() {
        dispositivos = new ArrayList<>();
    }

    @Override
    public void agregarObservador(Observador observador) {
        dispositivos.add(observador);
    }

    @Override
    public void eliminarObservador(Observador observador) {
        dispositivos.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador dispositivo : dispositivos) {
            dispositivo.actualizar(mensaje);
        }
    }

    // Método para simular la llegada de un nuevo mensaje
    public void recibirMensaje(String mensaje) {
        this.mensaje = mensaje;
        notificarObservadores();
    }
}

