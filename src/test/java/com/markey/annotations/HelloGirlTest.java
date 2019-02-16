package com.markey.annotations;

import com.markey.myannotation.Girl.HelloGirl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloGirlTest {

//    @Autowired
//    HelloGirl helloGirl;

    @Test
    public void HelloGirlTest() {

        HelloGirl helloGirl = new HelloGirl();
        helloGirl.sayHello("world");
    }
}
