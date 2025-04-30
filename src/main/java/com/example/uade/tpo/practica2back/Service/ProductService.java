package com.example.uade.tpo.practica2back.Service;

import java.util.List;
import java.util.Optional;

import com.example.uade.tpo.practica2back.entity.Product;

public interface ProductService {
    List<Product> getProducts();
    Optional<Product> getProductById(Long productId);
    Product createProduct(Product product);
    void deleteProductById(Long productId);
}
