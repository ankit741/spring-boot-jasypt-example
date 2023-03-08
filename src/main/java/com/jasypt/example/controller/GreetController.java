package com.jasypt.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @Value("${application.user.name}")
    private String userName;
    @Value("${application.user.password}")
    private String password;

    @GetMapping("/greet")
    public String greet() {
        return String.format("Hello , %s ! your password is : %s", userName, password);
    }
}
