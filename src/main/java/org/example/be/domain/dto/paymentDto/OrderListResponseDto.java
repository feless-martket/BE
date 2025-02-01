package org.example.be.domain.dto.paymentDto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.be.domain.Member;
import org.example.be.domain.Product;
import org.example.be.domain.Shipping;

@Data
public class OrderListResponseDto {

    private List<OrderList> orderLists;


    @Getter
    @Setter
    @Builder
    public static class OrderList {
        private List<ProductInfo> products;
        private MemberInfo memberInfo;
        private String tossOrderID;
        private String paymentMethod;
        private Integer totalPrice;
        private String orderStatus;
        private LocalDateTime orderDate;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class MemberInfo {
        private String name;
        private String phone;
        private String address;
        private String detailAddress;
        private String postalCode;
        private String deliveryNote;

        public static MemberInfo from(Member member, Shipping shipping) {
            return new MemberInfo(
                member.getName(),
                member.getPhone(),
                shipping.getAddress(),
                shipping.getDetailAddress(),
                shipping.getPostalCode(),
                shipping.getDeliveryNote()
            );
        }
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class ProductInfo {
        private Long id;
        private String name;
        private Integer price;
        private Integer quantity;

        public static ProductInfo from(Product product, Integer quantity) {
            return new ProductInfo(
                product.getId(),
                product.getName(),
                product.getPrice(),
                quantity
            );
        }
    }
}
