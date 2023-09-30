package chain;

public class Lector1000 implements  LectorMoneda {

  @Override
  public boolean verificar(Moneda moneda) {
    return "1000 Pesos".equals(moneda.getTexto()) || "COP 1000".equals(moneda.getTexto());
  }

  @Override
  public int leerValor(Moneda moneda) {
    return 1000;
  }
}
