package com.mr.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String greeting(String name) {
        System.out.println("Hi, "+ name);
        return  name;
    }
}
