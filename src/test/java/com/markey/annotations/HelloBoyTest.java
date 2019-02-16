package com.markey.annotations;

import com.markey.myannotation.Boy.HelloBoy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloBoyTest {

    HelloBoy helloBoy = new HelloBoy();
    @Test
    public void HelloBoyTest() {
        helloBoy.sayHello();
    }
}
