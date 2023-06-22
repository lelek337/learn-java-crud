package com.example.buysell.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.buysell.models.Product;

public interface ProductRepositoriy extends JpaRepository<Product, Long>{
    List<Product> findByTitle(String title);
}
