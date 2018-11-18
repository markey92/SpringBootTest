package com.markey.annotations;

import com.markey.com.markey.annotations.Lazy.MyLazy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyLazyTest {

    @Autowired
    MyLazy myLazy;

    @Test
    public void MyLazyTest() {
        myLazy.sayHello();
    }
}
