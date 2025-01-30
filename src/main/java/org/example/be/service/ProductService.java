package org.example.be.service;

import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.example.be.domain.DiscountStatus;
import org.example.be.domain.MainCategory;
import org.example.be.domain.Product;
import org.example.be.domain.SubCategory;
import org.example.be.domain.dto.productDto.ProductResponseDto;
import org.example.be.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Slf4j
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Service
@Transactional
public class ProductService {

    ProductRepository productRepository;

    // 특정 상품 상세 조회
    public ProductResponseDto getProduct(Long id) {
        Product product = productRepository.findByIdWithImages(id)
            .orElseThrow(() -> new IllegalArgumentException("Product not found with ID: " + id));


        return ProductResponseDto.fromEntity(product);
    }

    // MainCategory로 상품 목록 조회
    public Page<ProductResponseDto> getProductsByMainCategory(MainCategory mainCategory, PageRequest pageRequest) {
        // 페이지네이션 적용
        Page<Product> productsPage = productRepository.findByMainCategory(mainCategory, pageRequest);

        // 결과가 없다면 예외 처리
        if (productsPage.isEmpty()) {
            throw new IllegalArgumentException("MainCategory에서 상품을 찾을 수 없습니다: " + mainCategory);
        }

        // Page<Product>를 Page<ProductResponseDto>로 변환하여 반환
        return productsPage.map(ProductResponseDto::fromEntity);
    }


    // MainCategory와 SubCategory로 상품 목록 조회
    public Page<ProductResponseDto> getProductsBySubCategory(SubCategory subCategory, PageRequest pageRequest) {
        Page<Product> productsPage = productRepository.findBySubCategory(subCategory, pageRequest);
        if (productsPage.isEmpty()) {
            throw new IllegalArgumentException("sub category 를 찾을 수 없습니다:" + subCategory);
        }
        return productsPage.map(ProductResponseDto::fromEntity);
    }


    public List<ProductResponseDto> findByDiscountStatus(DiscountStatus discountStatus) {
        List<Product> products = productRepository.findByDiscountStatus(discountStatus);
        return products.stream().map(ProductResponseDto::fromEntity).toList();
    }
    public List<ProductResponseDto> findTop10ByOrderByPriceDesc() {
        List<Product> products = productRepository.findTop10ByOrderByPriceDesc();
        return products.stream().map(ProductResponseDto::fromEntity).toList();
    }

//    public Page<ProductResponseDto> getProductsByDiscountStatus(DiscountStatus discountStatus, PageRequest pageRequest) {
//        Page<Product> productsPage = productRepository.findByDiscountStatus(discountStatus, pageRequest);
//        if (productsPage.isEmpty()) {
//            throw new IllegalArgumentException("discountStatus에 맞는 상품을 찾을 수 없습니다:" + discountStatus);
//        }
//        return productsPage.map(ProductResponseDto::fromEntity);
//    }

    public Page<ProductResponseDto> getProductsByDiscountStatus(
        DiscountStatus discountStatus,
        int page,
        int size,
        Sort.Direction sortDirection
    ) {
        // 가격 기준으로 정렬 (오름차순 또는 내림차순)
        Sort sort = Sort.by(sortDirection, "price");
        log.info("sort = ${}", sort);

        // 페이지 정보 생성
        Pageable pageable = PageRequest.of(page, size, sort);

        // discountStatus가 null이 아니면 해당 상태로 조회
        // null이면 전체 조회(참고용)
        Page<Product> productPage;
        productPage = productRepository.findByDiscountStatus(discountStatus, pageable);


        // Page<Product> -> Page<ProductResponseDto>
        return productPage.map(ProductResponseDto::fromEntity);
    }
}