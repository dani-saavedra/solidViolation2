package chain;

public class Lector200 implements  LectorMoneda {

  @Override
  public boolean verificar(Moneda moneda) {
    return "200 Pesos".equals(moneda.getTexto());
  }

  @Override
  public int leerValor(Moneda moneda) {
    return 200;
  }
}
