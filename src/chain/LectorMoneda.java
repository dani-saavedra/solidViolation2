package chain;

public interface LectorMoneda {

  boolean verificar(Moneda moneda);

  int leerValor(Moneda moneda);
}
