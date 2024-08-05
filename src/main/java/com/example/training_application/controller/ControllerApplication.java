package com.example.training_application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
@RequestMapping("/api")
public class ControllerApplication {

    @GetMapping(value = "/user/details")
    public Object getAllUserDetails(){
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
}
