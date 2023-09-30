package rappi;

public class Cocinando implements EstadoPedido {

  @Override
  public void avanzar(Pedido pedido) {

  }

  @Override
  public void devolver(Pedido pedido) {

  }

  @Override
  public String estadoActual() {
    return "En la cocina";
  }
}
