package org.example.felessmartket_be.service;

import lombok.RequiredArgsConstructor;
import org.example.felessmartket_be.repository.CartItemRepository;
import org.example.felessmartket_be.repository.CartRepository;
import org.example.felessmartket_be.repository.MemberRepository;
import org.example.felessmartket_be.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;
    private final ProductRepository productRepository;
    private final MemberRepository memberRepository;

    /**
     * 장바구니에 담기
     * 1. 장바구니에 담을 상품 엔티티 조회
     * 2. 회원 엔티티 조회
     * 3. 장바구니 엔티티 조회
     * 4
     */
    public

}
