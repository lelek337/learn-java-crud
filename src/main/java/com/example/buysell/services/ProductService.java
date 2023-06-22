package com.example.buysell.services;

import org.springframework.stereotype.Service;

import com.example.buysell.models.Product;
import com.example.buysell.repositories.ProductRepositoriy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepositoriy productRepository;

    public List<Product> listProducts(String title) {
         if (title != null) productRepository.findByTitle(title);
         return productRepository.findAll();
    }

    public void saveProduct(Product product) {
       log.info("Saving new {}", product);
       productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
