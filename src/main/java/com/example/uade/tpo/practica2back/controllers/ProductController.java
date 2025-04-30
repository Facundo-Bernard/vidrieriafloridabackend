package com.example.uade.tpo.practica2back.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.uade.tpo.practica2back.Service.ProductServiceImpl;
import com.example.uade.tpo.practica2back.entity.Product;


@RestController
@RequestMapping("/product")
@CrossOrigin(origins = {"http://localhost:5174", "http://localhost:5173"})

public class ProductController {
    
    @Autowired
    private ProductServiceImpl productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getProducts();
    }

    @GetMapping("/{productId}")
    public Optional<Product> getProductById(@PathVariable Long productId){
        return productService.getProductById(productId);
    }

    @PostMapping("/crear")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @DeleteMapping("/{productId}")
    public void deleteProductById(@PathVariable Long productId){
        productService.deleteProductById(productId);
    }

}
