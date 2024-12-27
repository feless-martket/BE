package org.example.felessmartket_be.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.felessmartket_be.domain.dto.productDto.ProductRequestDto;
import org.example.felessmartket_be.domain.dto.productDto.ProductResponseDto;
import org.example.felessmartket_be.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@RequestMapping("product")
@RestController
public class ProductController {
    ProductService productService;
    @PostMapping("/save")
    public ResponseEntity<ProductResponseDto> save (@RequestBody ProductRequestDto productRequestDto){
        return
            ResponseEntity.ok(productService.save(productRequestDto));
    }
}
