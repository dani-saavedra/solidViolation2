package chain;

public class Lector500 implements  LectorMoneda {

  @Override
  public boolean verificar(Moneda moneda) {
    return "500 Pesos".equals(moneda.getTexto());
  }

  @Override
  public int leerValor(Moneda moneda) {
    return 500;
  }
}
