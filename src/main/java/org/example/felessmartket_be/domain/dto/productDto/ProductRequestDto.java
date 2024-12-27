package org.example.felessmartket_be.domain.dto.productDto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.example.felessmartket_be.domain.Category;
import org.example.felessmartket_be.domain.Product;
import org.example.felessmartket_be.domain.ProductStatus;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@NoArgsConstructor
public class ProductRequestDto {

    String name;
    String description;
    Integer price;
    Integer quantity;
    ProductStatus productStatus;
    String category;
    String imgURL;


    public static Product of(ProductRequestDto productRequestDto) {
        return new Product(
            null,
            productRequestDto.getName(),
            productRequestDto.getDescription(),
            productRequestDto.getPrice(),
            productRequestDto.getQuantity(),
            productRequestDto.getProductStatus(),
            productRequestDto.getCategory(),
            productRequestDto.getImgURL()
        );
    }
}
