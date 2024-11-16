package bd;

import modelo.Order;

public interface DataSource {
    void save(Order order);
}
