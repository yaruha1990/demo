package com.example.demo.service.impl;

import com.example.demo.service.SomeService;
import org.springframework.stereotype.Service;

@Service
public class BarService implements SomeService {
    @Override
    public String hello() {
        return "Hi! I am Bar";
    }
}
