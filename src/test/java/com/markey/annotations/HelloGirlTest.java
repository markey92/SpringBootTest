package com.markey.annotations;

import com.markey.annotations.Girl.HelloGirl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloGirlTest {

    @Autowired
    HelloGirl helloGirl;

    @Test
    public void HelloGirlTest() {
        helloGirl.sayHello("world");
    }
}
