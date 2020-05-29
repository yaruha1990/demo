package com.example.demo.service.resolver;

import com.example.demo.service.SomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class ServiceResolver {
    private final Map<String, SomeService> serviceMap;

    public SomeService getServiceByName(String serviceName) {
        return serviceMap.get(serviceName);
    }
}
