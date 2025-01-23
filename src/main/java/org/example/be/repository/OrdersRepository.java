package org.example.be.repository;


import java.util.List;
import org.example.be.domain.Member;
import org.example.be.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

    Orders findByTossOrderId(String tossOrderId);

    List<Orders> findOrdersByMember(Member member);
}
