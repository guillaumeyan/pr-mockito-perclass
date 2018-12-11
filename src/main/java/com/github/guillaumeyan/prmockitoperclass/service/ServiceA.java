package com.github.guillaumeyan.prmockitoperclass.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceA {

    private final ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public Double testA() {
        return serviceB.testB() + 1D;
    }
}
