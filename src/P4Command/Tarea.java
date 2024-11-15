package P4Command;

public class Tarea {
    private String nombre;
    private String descripcion;
    private boolean indterminada;

    public Tarea(String nombre, String descripcion) {

        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void crear() {
        System.out.println("Creada");
    }

    public void editar(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
        System.out.println("Editada");
    }

    public void eliminar() {
        System.out.println("Eliminada");
    }

    public void completar() {
        this.indterminada = true;
        System.out.println("Completada");
    }

    public void deshacer() {
        this.indterminada = false;
        System.out.println("Se reversa cierre");
    }

}
