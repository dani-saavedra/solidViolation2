package P2Observer;

public interface Sujeto {
    void agregarObservador(Observador observador);
    void eliminarObservador(Observador observador);
    void notificarObservadores();
}

