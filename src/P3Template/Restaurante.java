package P3Template;

public class Restaurante {
    public static void main(String[] args) {
        // Crear objetos para cada tipo de orden
        Orden pedidoComida = new Comida();
        Orden pedidoBebida = new Bebida();
        Orden pedidoPostre = new Postre();

        // Procesar cada tipo de orden
        System.out.println("Procesando la orden de comida:");
        pedidoComida.procesarOrden();

        System.out.println("\nProcesando la orden de bebida:");
        pedidoBebida.procesarOrden();

        System.out.println("\nProcesando la orden de postre:");
        pedidoPostre.procesarOrden();
    }
}
