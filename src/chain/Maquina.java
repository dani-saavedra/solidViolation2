package chain;

import java.util.Arrays;
import java.util.List;

public class Maquina {

  private List<LectorMoneda> lectorMonedas;

  public Maquina(LectorMoneda... lectorMonedas) {
    this.lectorMonedas = Arrays.asList(lectorMonedas);
  }

  int contarMonedas(List<Moneda> monedas) {
    int monto = 0;

    for (Moneda moneda : monedas) {
      for (LectorMoneda lectorMoneda : lectorMonedas) {
        if(lectorMoneda.verificar(moneda)){
          monto += lectorMoneda.leerValor(moneda);
        }
      }
    }
    return monto;
  }
}
