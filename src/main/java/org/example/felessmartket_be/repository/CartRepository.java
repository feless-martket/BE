package org.example.felessmartket_be.repository;

import org.example.felessmartket_be.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByMemberId(Long memberId);

}
