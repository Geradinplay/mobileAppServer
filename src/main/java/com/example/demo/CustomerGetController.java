package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerGetController {
    @GetMapping(path = "/hello")
    public HelloObject hello() {
        HelloObject helloObject = new HelloObject();
        return helloObject;
    }


    //@GetMapping
   // public String greet(@RequestParam("name") String name) {
    //    return "Hello, " + name;
   // }
}

