package com.github.guillaumeyan.prmockitoperclass.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ServiceB {

    public Double testB() {
        return Math.random();
    }
}
