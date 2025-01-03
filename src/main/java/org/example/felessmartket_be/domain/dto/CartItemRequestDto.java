package org.example.felessmartket_be.domain.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CartItemRequestDto {

    @NotNull(message = "상품아이디는 필수 입력값입니다.")
    private Long cartItemId;

    @Min(value = 1, message = "최소 한개 이상 상품을 담아주세요.")
    private Integer quantity;

}
