package com.example.demo.service.impl;

import com.example.demo.service.SomeService;
import org.springframework.stereotype.Service;

@Service
public class FooService implements SomeService {
    @Override
    public String hello() {
        return "Hi! I am Foo";
    }
}
