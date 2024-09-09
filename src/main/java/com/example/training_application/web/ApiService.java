package com.example.training_application.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {

    @Autowired
    private RestTemplate restTemplate;

    public String getExternalData() {
        String url = "https://v2.jokeapi.dev/joke/Any";
        return restTemplate.getForObject(url, String.class);
    }
}
