package com.meusestudos.course.services;

import com.meusestudos.course.entities.Product;
import com.meusestudos.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long productId) {
        Optional<Product> product = productRepository.findById(productId);
        return product.get();
    }

}