package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;

public class CustomerPostController {
    public Customer handlePost(@RequestBody Customer customer) {
        // Обработка полученных данных
        return customer;
    }
}
