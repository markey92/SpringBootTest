package com.markey.annotations;

import com.markey.myannotation.name.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {

    @Autowired
    NameConfig nameConfig;

    @Test
    public void HelloXiaohongTest() {
        Xiaohong xiaohong = new Xiaohong();
        xiaohong.sayHi();
    }

    @Test
    public void HelloXiaobaiTest() {
        Xiaobai xiaobai = new Xiaobai();
        xiaobai.sayHi();
    }

    @Test
    public void HelloXiaolanTest() {
        Xiaolan xiaolan = new Xiaolan();
        xiaolan.sayHi();
    }

    @Test
    public void HelloXiaolvTest() {
        Xiaolv xiaolv = new Xiaolv();
        xiaolv.sayHi();
    }
}
