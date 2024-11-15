package P4Command;


public class Comandos implements Accion {
    private Tarea tarea;

    public Comandos(Tarea task) {
        this.tarea = task;
    }

    @Override
    public void ejecutar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ejecutar'");
    }

    @Override
    public void reversar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reversar'");
    }
}

