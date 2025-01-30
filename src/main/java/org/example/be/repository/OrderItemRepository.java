package org.example.be.repository;

import java.util.List;
import org.example.be.domain.OrderItem;
import org.example.be.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByOrder(Orders orders);

}
