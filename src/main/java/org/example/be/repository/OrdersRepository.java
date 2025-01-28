package org.example.be.repository;


import java.time.LocalDateTime;
import java.util.List;
import org.example.be.domain.Member;
import org.example.be.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

    Orders findByTossOrderId(String tossOrderId);

    List<Orders> findOrdersByMember(Member member);

    @Query("SELECT o FROM Orders o WHERE o.member = :member AND o.orderDate BETWEEN :start AND :end ORDER BY o.orderDate DESC")
    List<Orders> findByMemberAndOrderDateBetween(
        @Param("member") Member member,
        @Param("start") LocalDateTime start,
        @Param("end") LocalDateTime end
    );
}
