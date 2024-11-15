package modelo;
import bd.Database;

public class Order {

    private String orderId;
    private double amount;
    private Database database;
    private ReporteOrdenes reporte;

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
        database.guardar();
        System.out.println("Order saved in database");
    }

    

    public String reporte(String orderId, double amount) {
        // Lógica para generar el reporte
        return reporte.generar(orderId, amount) ;
    }
}

