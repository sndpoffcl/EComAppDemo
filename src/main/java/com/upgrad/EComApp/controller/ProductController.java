package com.upgrad.EComApp.controller;

import com.upgrad.EComApp.entity.Product;
import com.upgrad.EComApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/productWelcome")
    public ResponseEntity getProductWelcome(){
        return ResponseEntity.ok("Welcome to Product Controller");
    }

    @GetMapping("/product/{id}")
    public ResponseEntity getProductDetails(@PathVariable("id") int id){
        Product savedProduct = productService.getProductDetails(id);
        return ResponseEntity.ok(savedProduct);
    }

    @PostMapping("/product")
    public ResponseEntity saveProductDetails(@RequestBody Product product){
        productService.saveProductDetails(product);
        return ResponseEntity.ok("Product is saved");
    }
}
