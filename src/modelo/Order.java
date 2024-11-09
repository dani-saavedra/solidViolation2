package modelo;

import bd.DatabaseMysql;

public class Order {

    private String orderId;
    private double amount;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void saveOrder() {
        // Lógica para guardar la orden en la base de datos
        //Envio a guardar en base de datos
        DatabaseMysql databaseMysql = new DatabaseMysql();
        System.out.println("Order saved in database");
        databaseMysql.guardar();
    }

    public String generateOrderReport() {
        // Lógica para generar el reporte
        return "Report for Order ID: " + orderId + " with amount: " + amount;
    }
}

