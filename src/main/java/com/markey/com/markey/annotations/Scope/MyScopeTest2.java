package com.markey.com.markey.annotations.Scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

//@Component
public class MyScopeTest2 {

    @Autowired
    MyScope myScope;

    @PostConstruct
    public void sayMyScope() {
        System.out.println("hello,i am MyScopeTest2, my scope is " + myScope.toString());
    }
}
