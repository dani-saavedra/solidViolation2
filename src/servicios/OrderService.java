package servicios;

import modelo.Order;

public interface OrderService {

    void saveOrder(Order order);
    String generateOrderReport(Order order);

}
