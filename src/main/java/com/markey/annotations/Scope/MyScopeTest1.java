package com.markey.annotations.Scope;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

//@Component
public class MyScopeTest1 {

    @Autowired
    MyScope myScope;

    @PostConstruct
    public void sayMyScope() {
        System.out.println("hello,i am MyScopeTest1, my scope is " + myScope.toString());
    }
}
