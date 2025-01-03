package org.example.felessmartket_be.repository;

import org.example.felessmartket_be.domain.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    CartItem findByCartAndproductId(Long cartId, Long productId);

}
