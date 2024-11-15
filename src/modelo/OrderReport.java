package modelo;

public class OrderReport implements ReporteOrdenes {    
    public String generar(String orderId, double amount) {
        // Lógica para generar el reporte
        return "Report for Order ID: " + orderId + " with amount: " + amount;
    }

    
}
