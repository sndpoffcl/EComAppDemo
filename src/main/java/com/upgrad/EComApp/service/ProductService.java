package com.upgrad.EComApp.service;

import com.upgrad.EComApp.entity.Product;

public interface ProductService {

    Product getProductDetails(int productId);
    void saveProductDetails(Product product);
}
