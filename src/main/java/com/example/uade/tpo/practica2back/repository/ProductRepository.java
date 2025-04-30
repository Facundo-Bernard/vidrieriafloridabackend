package com.example.uade.tpo.practica2back.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.uade.tpo.practica2back.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
