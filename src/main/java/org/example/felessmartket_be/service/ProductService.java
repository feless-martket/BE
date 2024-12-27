package org.example.felessmartket_be.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.felessmartket_be.domain.Product;
import org.example.felessmartket_be.domain.dto.productDto.ProductRequestDto;
import org.example.felessmartket_be.domain.dto.productDto.ProductResponseDto;
import org.example.felessmartket_be.repository.ProductRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@Service
public class ProductService {

    org.example.felessmartket_be.repository.ProductRepository ProductRepository;

    public ProductResponseDto save(ProductRequestDto productRequestDto){
        Product product = ProductRepository.save(ProductRequestDto.of(productRequestDto));
        return new ProductResponseDto(product.getId());
    }

}
