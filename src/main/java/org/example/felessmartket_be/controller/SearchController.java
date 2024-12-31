package org.example.felessmartket_be.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.felessmartket_be.domain.Product;
import org.example.felessmartket_be.service.SearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/search")
public class SearchController {
    private final SearchService searchService;

    @GetMapping("")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam ("keyword") String keyword){
        List<Product> products = searchService.searchProductByKeyword(keyword);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/suggestions")
    public ResponseEntity<List<String>> searchSuggestion(@RequestParam(value = "keyword",required = false) String keyword) {
        List<String> suggestion = searchService.searchSuggestion(keyword);
        return ResponseEntity.ok(suggestion);
    }
}
