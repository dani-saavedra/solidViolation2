package servicios;

import bd.DataSource;
import modelo.Order;

public class OrderServiceImpl implements OrderService{

    private static OrderService instance;
    private final DataSource dataSource;


    public OrderServiceImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static synchronized OrderService getInstance(DataSource dataSource) {
        if (instance == null) {
            instance = new OrderServiceImpl(dataSource);
        }
        return instance;
    }

    @Override
    public void saveOrder(Order order) {
        dataSource.save(order);
    }

    @Override
    public String generateOrderReport(Order order) {
        return "Report for Order ID: " + order.getOrderId() + " with amount: " + order.getAmount();
    }
}
