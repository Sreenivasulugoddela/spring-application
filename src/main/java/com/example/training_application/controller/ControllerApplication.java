package com.example.training_application.controller;

import com.example.training_application.model.Product;
import com.example.training_application.service.IProductService;
import com.example.training_application.web.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class ControllerApplication {


    @Autowired
    private ApiService apiService;

    @Autowired
    IProductService productService;

    @GetMapping(value = "/user/details")
    @CrossOrigin(origins = "*")
    public Object getAllUserDetails() {
        Map<Object, Object> userMap = new HashMap<>();
        userMap.put("firstName", "Sreenivasulu");
        userMap.put("lastName", "Goddela");
        userMap.put("age", 25);
        userMap.put("profession", "IT");
        userMap.put("company", "Techouts");
        return userMap;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @PostMapping("/data")
    public String fetchData() {
        return apiService.getExternalData();
    }

    @PostMapping("/product/save")
    public Product productSave(@RequestBody Map<Object, Object> reqPayload) {
        return productService.save(reqPayload);
    }
}
