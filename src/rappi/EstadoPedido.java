package rappi;

public interface EstadoPedido {

  void avanzar(Pedido pedido);

  void devolver(Pedido pedido);

  String estadoActual();
}
