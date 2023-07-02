package com.example.buysell.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.buysell.models.Images;
import com.example.buysell.models.Product;
import com.example.buysell.models.User;
import com.example.buysell.repositories.ProductRepositoriy;
import com.example.buysell.repositories.UserReopsitory;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.security.Principal;
import java.util.List;
import java.util.ArrayList;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepositoriy productRepository;
    private final UserReopsitory userReopsitory;

    public List<Product> listProducts(String title) {
         if (title != null) return productRepository.findByTitle(title);
         return productRepository.findAll();
    }

    public void saveProduct(Principal principal, Product product, MultipartFile file1, MultipartFile file2, 
    MultipartFile file3) throws IOException {
        product.setUser(getUserByPrincipal(principal));
        Images image1;
        Images image2;
        Images image3;
        if (file1.getSize() != 0) {
            image1 = toImageEntity(file1);
            image1.setPreviewImage(true);
            product.addImageToProduct(image1);
        }
        if (file2.getSize() != 0) {
            image2 = toImageEntity(file2);
            product.addImageToProduct(image2);
        }
        if (file3.getSize() != 0) {
            image3 = toImageEntity(file3);
            product.addImageToProduct(image3);
        }

       log.info("Saving new Product. Title: {}; Author email: {}", product.getTitle(), product.getUser().getEmail());
       Product productFromDb = productRepository.save(product);
       productFromDb.setPreviewImageId(productFromDb.getImages().get(0).getId());
       productRepository.save(product);
    }

    public User getUserByPrincipal(Principal principal) {
        if (principal == null) return new User();
        return userReopsitory.findByEmail(principal.getName());
    }

    private Images toImageEntity(MultipartFile file) throws IOException {
        Images image = new Images();
        image.setName(file.getName());
        image.setOriginFileName(file.getOriginalFilename());
        image.setContentTipe(file.getContentType());
        image.setSize(file.getSize());
        image.setBytes(file.getBytes());
        return image;
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
