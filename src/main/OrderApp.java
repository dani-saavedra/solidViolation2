package main;

import modelo.Order;

public class OrderApp {
    public static void main(String[] args) {
        // Crear una orden con un ID y un monto
        Order order = new Order("ORD123", 250.75);

        // Guardar la orden en la base de datos
        order.saveOrder();

        // Generar y mostrar el reporte de la orden
        String report = order.reporte("ORD123", 250.75);
        System.out.println(report);
    }
}

