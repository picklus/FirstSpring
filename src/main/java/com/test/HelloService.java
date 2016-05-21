package com.test;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
public class HelloService {
    public String sayHello() {
        return "Hello world!";
    }
}
