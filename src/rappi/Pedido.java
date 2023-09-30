package rappi;

public class Pedido {

  public EstadoPedido estado;
  private String ciudad;

  public Pedido() {
    this.estado = new Recibido();
  }
  /*
  public void avanzarEstado(){
    if("Recibido".equals(estado)){
      estado = "Cocinando";
      //cociinar
    }else if("Cocinando".equals(estado)){
      estado = "Reparto";
      //repartir
    }else if("Reparto".equals(estado)){
      estado = "Entregado";
    }
  }
 */

  public void avanzar(){
    estado.avanzar(this);
  }
}
