package chain;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Maquina maquina = new Maquina(new Lector200(), new Lector500(), new Lector1000());

    int montoTotal = maquina.contarMonedas(Arrays.asList(new Moneda("1 Peso"),
        new Moneda("200 Pesos"),
        new Moneda("500 Pesos"),
        new Moneda("COP 1000"),
        new Moneda("1000 Pesos")));

    System.out.println(montoTotal);
  }
}
