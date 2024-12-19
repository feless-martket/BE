package org.example.felessmartket_be.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderItem_id")
    Long id;

    @OneToOne
    @JoinColumn(name = "cartItem_id")
    CartItem cartItem;

    @ManyToOne
    @JoinColumn(name = "order_id")
    Orders order;
}
