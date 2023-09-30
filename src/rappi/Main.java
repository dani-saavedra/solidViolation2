package rappi;

public class Main {

  public static void main(String[] args) {
    Pedido pedidoJuan= new Pedido();
    System.out.println(pedidoJuan.estado.estadoActual());
    pedidoJuan.avanzar();
    System.out.println(pedidoJuan.estado.estadoActual());
  }
}
