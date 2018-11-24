package com.markey.annotations.Boy;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Team {


    HiBoy hiBoy = new HiBoy(); //新建对象，而不是Bean
    @PostConstruct
    public void sayHello() {
        hiBoy.sayHello();
    }
}
