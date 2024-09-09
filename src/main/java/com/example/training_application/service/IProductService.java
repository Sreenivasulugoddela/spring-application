package com.example.training_application.service;

import com.example.training_application.model.Product;

import java.util.Map;

public interface IProductService {

    Product save(Map<Object, Object> reqPayload);
}
