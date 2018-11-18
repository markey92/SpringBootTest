package com.markey.annotations;

import com.markey.com.markey.annotations.Scope.MyScopeTest1;
import com.markey.com.markey.annotations.Scope.MyScopeTest2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyScopeTest {

//    @Autowired
//    MyScopeTest1 myScopeTest1;
//    @Autowired
//    MyScopeTest2 myScopeTest2;
    @Test
    public void scopTest() {
//        myScopeTest1.sayMyScope();
//        myScopeTest2.sayMyScope();
    }
}
