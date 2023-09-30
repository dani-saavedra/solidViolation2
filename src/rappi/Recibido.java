package rappi;

public class Recibido implements EstadoPedido {

  @Override
  public void avanzar(Pedido pedido) {
    pedido.estado = new Cocinando();
  }

  @Override
  public void devolver(Pedido pedido) {

  }

  @Override
  public String estadoActual() {
    return "Pedido radicado";

  }
}
