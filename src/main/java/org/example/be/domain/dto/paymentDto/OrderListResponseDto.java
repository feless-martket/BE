package org.example.be.domain.dto.paymentDto;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class OrderListResponseDto {

    private List<OrderList> orderLists;


    @Getter
    @Setter
    @Builder
    public static class OrderList {
        private String productName;
        private String tossOrderID;
        private String paymentMethod;
        private Integer totalPrice;
        private String orderStatus;
    }
}
