package org.example.be.domain;

import lombok.Getter;

@Getter
public enum OrderStatus {
    PAID("결제완료"),
    delivery("배송중"),
    ready("배송준비"),
    complete("배송완료");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }
}
