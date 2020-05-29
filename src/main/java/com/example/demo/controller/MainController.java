package com.example.demo.controller;

import com.example.demo.service.resolver.ServiceResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final ServiceResolver serviceResolver;

    @GetMapping("/hello")
    public String hello(@RequestParam("serviceName") String serviceName) {
        return serviceResolver.getServiceByName(serviceName).hello();
    }
}
