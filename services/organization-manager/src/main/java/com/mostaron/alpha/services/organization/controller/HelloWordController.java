package com.mostaron.alpha.services.organization.controller;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWordController {

    @Value("${service.name}")
    private String serviceName;

    @GetMapping("")
    public String sayHello() {
        return "hello " + serviceName;
    }
}
