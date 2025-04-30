package com.example.uade.tpo.practica2back.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uade.tpo.practica2back.entity.Product;
import com.example.uade.tpo.practica2back.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long productId) {
        return productRepository.findById(productId);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProductById(Long productId) {
        productRepository.deleteById(productId);
    }

}
