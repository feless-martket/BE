package org.example.be.repository;

import org.example.be.domain.Cart;
import org.example.be.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByMember_Username(String username);
    Cart findByMember(Member member);

    void deleteCartById(Long id);
}
