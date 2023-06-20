package com.example.bysel.services;

import org.springframework.stereotype.Service;
import com.example.bysel.models.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add( new Product(++ID, "Playstation 5", "Simpol description", 6700, "Homel", "Loan"));
        products.add( new Product(++ID, "Iphon 12", "Simpol description", 2400, "Brest", "Tomas"));
    }
    public List<Product> listProducts() { return products; }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }
}
