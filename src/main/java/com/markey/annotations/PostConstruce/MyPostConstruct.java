package com.markey.annotations.PostConstruce;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

//@Component
public class MyPostConstruct {

    @Autowired
    YourPostConstruct yourPostConstruct;

    @PostConstruct
    public void init() {
        yourPostConstruct.sayHello();
    }

    public MyPostConstruct() {
//        yourPostConstruct.sayHello();
    }
}
