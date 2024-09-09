package com.example.training_application.service.impl;

import com.example.training_application.model.Product;
import com.example.training_application.repo.ProductRepo;
import com.example.training_application.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProductService implements IProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public Product save(Map<Object, Object> reqPayload) {
        Product product = Product.builder()
                .ref((String) reqPayload.get("ref"))
                .price((Double) reqPayload.get("price"))
                .brand((String) reqPayload.get("brand"))
                .build();
        return productRepo.save(product);
    }
}
