package main;

import bd.DataSource;
import bd.DatabaseMysql;
import modelo.Order;
import servicios.OrderService;
import servicios.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        // Crear una orden con un ID y un monto
        Order order = new Order("ORD123", 250.75);

        // Traigo la dependencia de la implementacion de la orden
        DataSource databaseMysql = DatabaseMysql.getInstance();
        OrderService orderService = OrderServiceImpl.getInstance(databaseMysql);
        // Guardar la orden en la base de datos
        orderService.saveOrder(order);

        // Generar y mostrar el reporte de la orden
        String report = orderService.generateOrderReport(order);
        System.out.println(report);
    }
}
