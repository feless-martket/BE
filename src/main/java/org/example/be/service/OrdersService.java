package org.example.be.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.be.domain.Member;
import org.example.be.domain.OrderItem;
import org.example.be.domain.Orders;
import org.example.be.domain.Payment;
import org.example.be.domain.Product;
import org.example.be.domain.Shipping;
import org.example.be.domain.dto.paymentDto.OrderItemRequestDto;
import org.example.be.domain.dto.paymentDto.OrderItemRequestDto.OrderItemDto;
import org.example.be.domain.dto.paymentDto.OrderListResponseDto;
import org.example.be.domain.dto.paymentDto.OrderListResponseDto.MemberInfo;
import org.example.be.domain.dto.paymentDto.OrderListResponseDto.OrderList;
import org.example.be.domain.dto.paymentDto.OrderListResponseDto.ProductInfo;
import org.example.be.repository.OrderItemRepository;
import org.example.be.repository.OrdersRepository;
import org.example.be.repository.PaymentRepository;
import org.example.be.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrdersService {

    private final OrdersRepository ordersRepository;
    private final ProductRepository productRepository;
    private final OrderItemRepository orderItemRepository;
    private final RedisService redisService;
    private final PaymentRepository paymentRepository;

    public Orders createOrders(Member member, String tossOrderId) {
        Orders newOrders = Orders.createOrders(member);
        newOrders.setTossOrderId(tossOrderId);
        return ordersRepository.save(newOrders);
    }

    public Orders findByTossOrderId(String TossOrderId) {
        return ordersRepository.findByTossOrderId(TossOrderId);
    }

    public Orders saveOrderItems(OrderItemRequestDto request, Orders orders) {
        Map<Product, Integer> products = transProduct(request);
        for (Product product : products.keySet()) {
            OrderItem newOrderItem = OrderItem.createOrderItem(orders, product, products.get(product));
            orderItemRepository.save(newOrderItem);
        }
        orders.updateTotalPrice(request.getTotalPrice());
        return ordersRepository.save(orders);
    }

    public Map<Product, Integer> transProduct(OrderItemRequestDto request) {
        List<OrderItemDto> orderItemDtos = request.getOrderItems();
        Map<Product, Integer> products = new HashMap<>();

        for (OrderItemDto orderItemDto : orderItemDtos) {
            Product product = productRepository.findById(orderItemDto.getProductId()).orElse(null);
            Integer quantity = orderItemDto.getQuantity();
            products.put(product, quantity);
        }
        return products;
    }

    public List<OrderList> createOrdersList(Member member, String period) {
        LocalDateTime startDate = computeStartDate(period);
        List<Orders> ordersList = ordersRepository.findByMemberAndOrderDateBetween(member, startDate, LocalDateTime.now());
        return ordersList.stream().map(this::mappingOrderList).toList();
    }


    public OrderList mappingOrderList(Orders orders) {
         return OrderListResponseDto.OrderList.builder()
             .products(getProducts(orders))
             .memberInfos(getMemberInfo(orders))
             .tossOrderID(orders.getTossOrderId())
             .paymentMethod(getPaymentMethod(orders))
             .totalPrice(orders.getTotalPrice())
             .orderStatus("결제완료")
             .orderDate(orders.getOrderDate())
             .build();
    }

    public List<ProductInfo> getProducts(Orders orders) {
        List<OrderItem> orderItems = orderItemRepository.findByOrder(orders);
        List<ProductInfo> productInfos = new ArrayList<>();
        for (OrderItem orderItem : orderItems) {
            productInfos.add(ProductInfo.from(
                productRepository.findById(orderItem.getProduct().getId())
                    .orElseThrow(() -> new RuntimeException("product 존재하지 않음")),
                orderItem.getQuantity())
            );
        }
        return productInfos;
    }

    public MemberInfo getMemberInfo(Orders orders) {
        Member member = orders.getMember();
        Shipping shipping = orders.getShipping();
        return MemberInfo.from(member, shipping);
    }

    public String getPaymentMethod(Orders orders) {
        Payment payment = paymentRepository.findByOrder(orders);
        return payment.getPaymentMethod();
    }

    private LocalDateTime computeStartDate(String period) {
        LocalDateTime now = LocalDateTime.now();
        return switch (period) {
            case "6개월" -> now.minusMonths(6);
            case "1년" -> now.minusYears(1);
            case "3년" -> now.minusYears(3);
            default -> now.minusMonths(3);
        };
    }






}
